package com.hoon.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class TestController {

	@RequestMapping(value ="/write")
	public String write(Model model) {
		
		model.addAttribute("id", "tiger");
		
		
		return "write";
	}
	
	

		@RequestMapping(value ="/reply")
		public ModelAndView reply() {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("age", 30);
			mv.setViewName("board/reply");
			
			return mv;
		}
	
}
