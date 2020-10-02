package vn.com.oriexace.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import vn.com.oriexace.authentication.MyUserDetailsService;

@Configuration
@EnableWebSecurity
@Transactional
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyUserDetailsService myUserDetailsService;

	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// SÃ©t Ä‘áº·t dá»‹ch vá»¥ Ä‘á»ƒ tÃ¬m kiáº¿m User trong Database.
		// VÃ  sÃ©t Ä‘áº·t PasswordEncoder.
		auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		// CÃ¡c trang khÃ´ng yÃªu cáº§u login
		http.authorizeRequests().antMatchers("/*"/* , "/welcome", "/login", "/logout" */).permitAll();

		// Trang /userInfo yÃªu cáº§u pháº£i login vá»›i vai trÃ² USER hoáº·c ADMIN.
		// Náº¿u chÆ°a login, nÃ³ sáº½ redirect tá»›i trang /login.
		//http.authorizeRequests().antMatchers("/userInfo").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");

		// Trang chá»‰ dÃ nh cho ADMIN
		http.authorizeRequests().antMatchers("/quan-tri/*").access("hasRole('ROLE_ADMIN')");

		// Khi ngÆ°á»�i dÃ¹ng Ä‘Ã£ login, vá»›i vai trÃ² XX.
		// NhÆ°ng truy cáº­p vÃ o trang yÃªu cáº§u vai trÃ² YY,
		// Ngoáº¡i lá»‡ AccessDeniedException sáº½ nÃ©m ra.
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		// Cáº¥u hÃ¬nh cho Login Form.
		http.authorizeRequests().and().formLogin()//

				// Submit URL cá»§a trang login
				.loginProcessingUrl("/logins") // Submit URL
				.loginPage("/login")//
				.defaultSuccessUrl("/quan-tri")//
				.failureUrl("/login?error=true")//
				.usernameParameter("username")//
				.passwordParameter("password")

				// Config cho Logout Page.
				.and().logout().logoutUrl("/logout").logoutSuccessUrl("/index");

	}
}
