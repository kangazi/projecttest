package webproject.service.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webproject.entity.member.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private SqlSession sqlSession;
	//http://coderbycode.tistory.com/111
	@Override
	public void register(Member member) {
		sqlSession.insert("register", member);
		
	}
	

}
