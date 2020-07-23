package vn.com.oriexace.controller.admin;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vn.com.oriexace.entity.Category;
import vn.com.oriexace.service.CategoryService;
import vn.com.oriexace.service.mess.CategoryMess;

@Controller
@RequestMapping(value = "/quan-tri/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = "")
	public String categoryPage(Model model,
			@RequestParam(defaultValue = "", value = "tu-khoa") String name,
			@RequestParam(defaultValue = "1") Integer pageNo,
			@RequestParam(defaultValue = "15") Integer pageSize,
			@RequestParam(defaultValue = "DESC") String sortType,
			@RequestParam(defaultValue = "name") String sortBy,
			HttpSession session) {
		CategoryMess categoryMess = categoryService.getAllCategorys(pageNo, pageSize, name, sortType, sortBy);
		model.addAttribute("categoryMess", categoryMess);
		
		return "admin/category";
	}

	@PostMapping(value = "/add-update-category")
	public String saveAndUpdate(HttpServletRequest request, Principal principal) {

		categoryService.saveAndUpdate(request, principal);

		System.out.println("add or update thanh cong category thanh cong");
		return "redirect:" + request.getHeader("Referer");
	}

	@GetMapping(value = "/get-category-by-id")
	public @ResponseBody String getCategory(HttpServletRequest request) throws JsonProcessingException {
		Category category = categoryService.getOneCategoryById(request);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(category.getName());
		return mapper.writeValueAsString(category);
	}
	
	@PostMapping(value = "/xoa-the-loai")
	public String xoaTheLoai(HttpServletRequest request, HttpSession session) {

//		categoryService.deleteCategory(request);
		session.setAttribute("tenTheloai", request.getParameter("name").toString());

		System.out.println("xóa thành công "+  request.getParameter("name").toString());

		return "redirect:" +  request.getHeader("Referer");
	}
	
}
