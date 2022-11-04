package kr.or.ddit.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.service.TreeService;
import kr.or.ddit.vo.TreeVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TreeController {
	
	@Autowired
	TreeService treeService;
	
	@GetMapping("tree/tree")
	public String treeTest() {
		return "tree/tree";
	}

	@GetMapping("tree/tree2")
	public String treeTest2() {
		return "tree/tree2";
	}
	
	@GetMapping("tree/tree3")
	public String treeTest3() {
		return "tree/tree3";
	}

//	@GetMapping("tree/tree4")
//	public String treeTest4() {
//		return "tree/tree4";
//	}

	@RequestMapping(value = "tree/tree4", method = RequestMethod.GET)
	public ModelAndView tree(ModelAndView mav, @RequestParam(value = "keyword", required = false) String keyword) {
		List<TreeVO> list = this.treeService.list(keyword);
		List<TreeVO> result = new ArrayList<TreeVO>();
		for (TreeVO vo : list) {
			log.info("vo : " + vo.toString());
			
		}
		for(int i = 0 ;i<list.size();i++) {
			if(list.get(i).getOrgname().equals("전략기획부문")) {
				result.add(list.get(i));
			}
		}
		// forwarding
		mav.setViewName("tree/tree4");
		// select 결과 목록을 데이터로 넣어줌
		mav.addObject("data", result);

		return mav;
	}

}
