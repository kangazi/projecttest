package webproject.controller.member;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import webproject.entity.member.AddRoom;
import webproject.entity.member.MemberImage;
import webproject.service.member.MemberService;

@Controller
public class AddRoomController {

	@Autowired
	private MemberService memberservice;
	
	@Autowired
	private HttpSession session;
	
	@PostMapping("/addroom")
	public String addroom(@ModelAttribute AddRoom addroom) {
		memberservice.addroom(addroom);
		return "redirect:/home_main";
	}
	
	@GetMapping("/addroom")
	public String addroom() {
		
		return "addroom";
	}
	
	@PostMapping("/addimage")
	public String uploadImage(@ModelAttribute MemberImage image, MultipartHttpServletRequest mRequest) throws IllegalStateException, IOException {
/*	테스트 코드
		MultipartFile file = mRequest.getFile("image");
		String fname = file.getOriginalFilename();
		Long size = file.getSize();
		
		
		System.out.println("imageController 실행");
		System.out.println("file : "+file);
		System.out.println("OriginFileName : "+fname);
		System.out.println("FileSize : "+size);
*/
		
		
		MultiValueMap<String, MultipartFile> map = mRequest.getMultiFileMap();
		for(String key : map.keySet()) {
			System.out.println("key : "+key);
			File root = new File("D:/uploadImage");
			if(!root.exists())	root.mkdirs();
			
			File target;
			List<MultipartFile> list = map.get(key);
			for(MultipartFile file : list) {
				String fname = file.getOriginalFilename();
				image.setImage_fname(fname);
				Long size = file.getSize();
				image.setImage_size(size);
				String rname = UUID.randomUUID().toString();
				image.setImage_rname(rname);
				image.setImage_writer((int)session.getAttribute("id"));
				target = new File(root, rname);
				file.transferTo(target);
				memberservice.upload(image);
				
				System.out.println("file : "+file);
				System.out.println("fileOrigin : "+file.getOriginalFilename());
			}
		}
		return "redirect:/addroom";
	}

	@GetMapping("/addimage")
	public String uploadImage() {
		return "redirect:/addroom";
	}
	
}
