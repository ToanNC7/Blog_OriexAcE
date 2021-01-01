package vn.com.oriexace.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * A user.
 */
@Entity
@Table(name = "bl_user")
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

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

}
