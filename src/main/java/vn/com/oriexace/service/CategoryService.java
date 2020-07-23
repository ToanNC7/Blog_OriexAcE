package vn.com.oriexace.service;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import vn.com.oriexace.entity.Category;
import vn.com.oriexace.service.mess.CategoryMess;

public interface CategoryService {
	
	public void saveAndUpdate(HttpServletRequest request, Principal principal);
	
	public CategoryMess getAllCategorys(Integer pageNo, Integer pageSize, String name, String sortType, String sortBy);
	
	public Category getOneCategoryById(HttpServletRequest request);
	
	public void deleteCategory(HttpServletRequest request);
}
