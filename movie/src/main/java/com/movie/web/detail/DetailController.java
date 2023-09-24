package com.movie.web.detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DetailController {
	
	@Autowired 
	private DetailService detailService;

	
	@GetMapping("/detail")
	public String detailPage(@RequestParam("mv_code") String mvCode, Model model) {
	  
		
	    return "detail"; 
	}
	
	@PostMapping("/search")
	public String detail(@RequestParam("mv_name") String mv_name) {
		
		System.out.println(mv_name);
		
		String mv_code = detailService.movie(mv_name);
		System.out.println(mv_code);
		
		
		return "redirect:detail?mv_code="+mv_code;
	}
	
}
