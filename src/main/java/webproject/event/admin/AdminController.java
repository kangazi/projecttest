package webproject.event.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/admin_account")
	public void adminaccount() {
		
		
	}
	
	@RequestMapping("/admin_event")
	public void adminevent() {
		
	}
}
