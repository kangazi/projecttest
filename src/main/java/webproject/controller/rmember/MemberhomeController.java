package webproject.controller.rmember;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberhomeController {
	
	@RequestMapping("/member")
	public String memeber() {
		
		return "/member";
	}
	
}
