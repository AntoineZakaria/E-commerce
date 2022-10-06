package com.ecommerce.demo.controller;

import java.util.Arrays;
import java.util.List;

import com.ecommerce.demo.models.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Product p1 = new Product(1,"book","awesome",50);
		Product p2 = new Product(2,"book2","awesome1",51);
		Product p3 = new Product(3,"book3","awesome2",52);
		Product p4 = new Product(4,"book4","awesome3",53);
		Product p5 = new Product(5,"book5","awesome4",54);
		
		List<Product> products = Arrays.asList(p1,p2,p3,p4,p5);
		
		//System.out.println(products);
		model.addAttribute("products",products);
		
		return "home";
	
	}
	@GetMapping("product")
	public String showProductById(@RequestParam("id")String id, Model  model) {

		Product p1 = new Product(Integer.valueOf(id),"book","awesome",50);
		System.out.println(p1);
		model.addAttribute("product",p1);
		
		return "product";
		
	}

}
