package vn.com.oriexace.service;

import java.util.List;

import vn.com.oriexace.entity.Category;

public interface CategoryService {
	
	public List<Category> getAllCategorys(String name);
}
