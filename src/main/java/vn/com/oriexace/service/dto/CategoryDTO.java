package vn.com.oriexace.service.dto;

import javax.persistence.Column;

import vn.com.oriexace.entity.Category;

public class CategoryDTO {
	private Long id;

	private String name;

	private String description;

	private String url;

	private boolean locked;

	
	
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CategoryDTO(Category category) {
		this.id=category.getId();
		this.name=category.getName();
		this.url=category.getUrl();
		this.locked=category.isLocked();
	}

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
	
	
}
