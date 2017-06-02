package org.bars.rest.samples.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleRestController {

	@RequestMapping("/api/sample")
	public String getSample(Model model){
		model.addAttribute("Hello World");
		return "jsonTemplate";
	}
	
}
