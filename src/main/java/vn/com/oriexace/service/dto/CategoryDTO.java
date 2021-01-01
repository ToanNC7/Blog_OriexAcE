package vn.com.oriexace.service.dto;

import lombok.Data;
import vn.com.oriexace.entity.Category;

@Data
public class CategoryDTO {
	private String id;

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
	
}
