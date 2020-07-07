package vn.com.oriexace.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A user.
 */
@Entity
@Table(name = "bl_user")

public class User extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50, unique = true, nullable = false)
	private String login;

	@JsonIgnore
	@Column(name = "password_hash", length = 60, nullable = false)
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "image_url", length = 50)
	private String imageUrl;

	@Column(name = "activated", nullable = false)
	private boolean activated = false;

	@Column(name = "locked", nullable = false)
	private boolean locked = false;

	@Column(name = "can_change", nullable = false)
	private boolean canChange = false;

	@Column(name = "must_chage", nullable = false)
	private boolean mustChage = false;

	@Column(name = "activation_key", length = 20)
	@JsonIgnore
	private String activationKey;

	@Column(name = "reset_key", length = 20)
	@JsonIgnore
	private String resetKey;

	@Column(name = "reset_date")
	private Instant resetDate = null;

	@Column(name = "url")
	private String url;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "bl_user_role", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "role_name", referencedColumnName = "name") })
	//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	@BatchSize(size = 20)
	private Set<Role> role;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@BatchSize(size = 1)
	private UserInfo userInfo;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users", cascade = CascadeType.ALL)
//	private List<Post> posts = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isCanChange() {
		return canChange;
	}

	public void setCanChange(boolean canChange) {
		this.canChange = canChange;
	}

	public boolean isMustChage() {
		return mustChage;
	}

	public void setMustChage(boolean mustChage) {
		this.mustChage = mustChage;
	}

	public String getActivationKey() {
		return activationKey;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	public String getResetKey() {
		return resetKey;
	}

	public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}

	public Instant getResetDate() {
		return resetDate;
	}

	public void setResetDate(Instant resetDate) {
		this.resetDate = resetDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

//	public List<Post> getPosts() {
//		return posts;
//	}
//
//	public void setPosts(List<Post> posts) {
//		this.posts = posts;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", login=" + login + ", password=" + password + ", email=" + email + ", imageUrl="
//				+ imageUrl + ", activated=" + activated + ", locked=" + locked + ", canChange=" + canChange
//				+ ", mustChage=" + mustChage + ", activationKey=" + activationKey + ", resetKey=" + resetKey
//				+ ", resetDate=" + resetDate + ", url=" + url + ", role=" + role + ", userInfo=" + userInfo + ", posts="
//				+ posts + "]";
//	}

}
