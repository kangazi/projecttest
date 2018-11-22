package webproject.entity.member;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author 김현진
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddRoom {
	private int addroom_no;							//등록번호
	private String addroom_main_fname;		//메인이미지 파일명
	private String addroom_main_rname;		//메인이미지 원본명
	private Long addroom_main_size;			//메인이미지 사이즈
	private String addroom_img1_fname;		//이미지1
	private String addroom_img1_rname;
	private Long addroom_img1_size;
	private String addroom_img2_fname;		//이미지2
	private String addroom_img2_rname;
	private Long addroom_img2_size;
	private String addroom_img3_fname;		//이미지3
	private String addroom_img3_rname;
	private Long addroom_img3_size;
	private String addroom_roomname;		//객실명
	private int addroom_roomcount;				//동일한 등급의 객실수
	private int addroom_limitperson;			//객실 수용가능 인원
	private int addroom_timeprice;				//대실요금
	private int addroom_dateprice;				//숙박요금
	private String addroom_info;					//객실정보
	private String addroom_reg;					//객실등록일
	private int addroom_settime;					//대실이용시간
	private String addroom_entrytime;			//숙박입실가능시간
	private String addroom_exittime;			//숙박퇴실시간
	
	private MultipartFile image;					//이미지 저장을 위한 변수
}
