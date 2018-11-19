package webproject.entity.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @Builder
@NoArgsConstructor
public class Member {
	private String reg_number; //사업자번호
	private String mb_name;
	private String mb_pw;
	private String mb_address;
	private String mb_tel;
	private String mb_type;
	private String mb_join_date;
	private String mb_ceo;
	private String mb_grade;
}
