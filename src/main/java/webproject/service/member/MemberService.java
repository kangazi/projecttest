package webproject.service.member;

import org.springframework.stereotype.Service;

import webproject.entity.member.Member;

@Service

public interface MemberService {
	void register(Member member);
}
