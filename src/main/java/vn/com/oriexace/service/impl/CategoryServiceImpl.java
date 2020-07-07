package vn.com.oriexace.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.oriexace.entity.Category;
import vn.com.oriexace.repository.CategoryReposytory;
import vn.com.oriexace.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private CategoryReposytory categoryRepository;

	@Transactional(readOnly = true)
	public List<Category> getAllCategorys(String name) {	
		return categoryRepository.findAllCategory(name);
	}

}
