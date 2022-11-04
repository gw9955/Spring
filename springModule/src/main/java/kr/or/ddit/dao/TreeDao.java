package kr.or.ddit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ddit.vo.TreeVO;

@Repository
public class TreeDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<TreeVO> list(String keyword) {
		return this.sqlSessionTemplate.selectList("tree.list", keyword);
	}

}
