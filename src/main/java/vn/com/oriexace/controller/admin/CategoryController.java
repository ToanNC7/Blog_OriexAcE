package vn.com.oriexace.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.oriexace.entity.Category;
import vn.com.oriexace.service.CategoryService;
import vn.com.oriexace.service.mess.CategoryMess;

@Controller
@RequestMapping(value = "/quan-tri")
public class CategoryController {
	
	
	@Autowired
	private CategoryService categoryService;
	@GetMapping(value = "/category")
	public String categoryPage(Model model, 
			@RequestParam(defaultValue = "", value = "tu-khoa") String name) {
		List<Category>  categoryMess = categoryService.getAllCategorys( name);
		model.addAttribute("categoryMess", categoryMess);
		
		return "admin/category";
	}
}
