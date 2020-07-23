package vn.com.oriexace.entity;

import java.io.Serializable;
import java.security.Principal;
import java.time.Instant;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {


	private static final long serialVersionUID = 1L;

	@Column(name = "code", nullable = false, length = 50, updatable = false)
	@JsonIgnore

	private String code = UUID.randomUUID().toString();
	@CreatedBy
	@Column(name = "created_by", nullable = false, length = 50, updatable = false)
	@JsonIgnore
	private String createdBy;

	@CreatedDate
	@Column(name = "created_date", updatable = false)
	@JsonIgnore
	private Instant createdDate = Instant.now();

	@LastModifiedBy
	@Column(name = "updated_by", length = 50)
	@JsonIgnore
	private String updatedBy;

	@LastModifiedDate
	@Column(name = "updated_date")
	@JsonIgnore
	private Instant UpdatedDate = Instant.now();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Instant getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		UpdatedDate = updatedDate;
	}

}
