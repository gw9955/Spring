package kr.or.ddit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.dao.BookDao;
import kr.or.ddit.service.BookService;
import kr.or.ddit.vo.BookVO;

// 스프링프레임워크에서 자바빈으로 등록해준다
@Service
public class BookServiceImpl implements BookService {
	// DI : 의존성 주입
	// 데이터베이스 접근을 위해 BookDao 인스턴스를 주입받자
	@Autowired
	BookDao bookDao;
	
	// BOOK 테이블에 insert
	public int insert(BookVO bookVO) {
		// insert 처리 결과(0 또는 1이상)
		return this.bookDao.insert(bookVO);
	}
}
