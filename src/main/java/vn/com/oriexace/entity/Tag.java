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

@Entity
@Table(name = "bl_tag")
@Data
@EqualsAndHashCode(callSuper = false)
public class Tag extends AbstractEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Column(name = "title")
	private String title;

	@Column(name = "content")
	private String content;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "locked")
	private boolean locked;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "bl_tag_post", joinColumns = {
			@JoinColumn(name = "tag_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "post_id", referencedColumnName = "id") })
	//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	@BatchSize(size = 20)
	private List<Post> posts = new ArrayList<Post>();
}
