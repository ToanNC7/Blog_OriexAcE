package vn.com.oriexace.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bl_post")
public class Post extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User users;
	
	@Column(name = "title")
	private String title;

	@Column(name = "summary")
	private String sunmary;

	@Column(name = "content")
	private String content;

	@Column(name = "url")
	private String url;

	@Column(name = "image")
	private String image;

	@Column(name = "published")
	private boolean published;

	@Column(name = "locked")
	private boolean locked;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "posts", cascade = CascadeType.ALL)
	private List<Comment> comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSunmary() {
		return sunmary;
	}

	public void setSunmary(String sunmary) {
		this.sunmary = sunmary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", users=" + users + ", title=" + title + ", sunmary=" + sunmary + ", content="
				+ content + ", url=" + url + ", image=" + image + ", published=" + published + ", locked=" + locked
				+ ", comment=" + comment + "]";
	}
	
}
