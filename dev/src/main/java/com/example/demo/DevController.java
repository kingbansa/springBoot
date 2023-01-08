package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DevController {

	@GetMapping("/main")
	@ResponseBody
	public String main() {
		return "테스트를 위한 변경?!!";
	}
}
