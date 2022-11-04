package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.service.impl.TreeServiceImpl;
import kr.or.ddit.vo.TreeVO;

public interface TreeService {

	List<TreeVO> list(String keyword);
}
