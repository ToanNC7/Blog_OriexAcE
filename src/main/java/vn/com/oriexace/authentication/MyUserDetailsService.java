package vn.com.oriexace.authentication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vn.com.oriexace.entity.Role;
import vn.com.oriexace.service.UserService;

@Service
public class MyUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserService userService;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<vn.com.oriexace.entity.User> user = userService.getUserWithAuthoritiesByLogin(username);
        System.out.println("UserInfo= " + user);
 
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
         
        // [USER,ADMIN,..]
        Set<Role> roles= user.get().getRole();
         
        List<GrantedAuthority> grantList= new ArrayList<GrantedAuthority>();
        if(roles!= null)  {
            for(Role role: roles)  {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
                grantList.add(authority);
            }
        }        
         
        UserDetails userDetails = (UserDetails) new User(user.get().getLogin(), //
                user.get().getPassword(),grantList);
 
        return userDetails;
    }
     
}
