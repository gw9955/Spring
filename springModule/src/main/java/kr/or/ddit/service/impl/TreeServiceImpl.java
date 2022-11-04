package kr.or.ddit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.dao.TreeDao;
import kr.or.ddit.service.TreeService;
import kr.or.ddit.vo.TreeVO;

// 스프링프레임워크에서 자바빈으로 등록해준다
@Service
public class TreeServiceImpl implements TreeService {

	@Autowired
	TreeDao treeDao;

	@Override
	public List<TreeVO> list(String keyword){
		return this.treeDao.list(keyword);
	}

}
