package vn.com.oriexace.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bl_category")
public class Category extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", url=" + url + ", locked="
				+ locked + ", posts=" + posts + "]";
	}

}
