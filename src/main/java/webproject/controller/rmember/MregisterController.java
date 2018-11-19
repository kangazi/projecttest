package webproject.controller.rmember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.ApplicationScope;

import webproject.entity.member.Member;
import webproject.service.member.MemberService;


@Controller
public class MregisterController {
	
	@Autowired
	private MemberService memberService;
	
	//회원사 등록
	
//	@GetMapping("/mregister")
//	public String mregister() {
//		return "/mregister";
//	}
	
	
	@RequestMapping("/member_register")
	public String mregister(Member member) {
//		memberService.register(member);
		return "/member_register";
	}
	
	
}
