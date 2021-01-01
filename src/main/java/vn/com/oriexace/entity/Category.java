package vn.com.oriexace.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "bl_category")
public class Category extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "url")
	private String url;

	@Column(name = "locked")
	private boolean locked;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "bl_category_post", joinColumns = {
			@JoinColumn(name = "category_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "post_id", referencedColumnName = "id") })
	@BatchSize(size = 20)
	private List<Post> posts = new ArrayList<Post>();

}
