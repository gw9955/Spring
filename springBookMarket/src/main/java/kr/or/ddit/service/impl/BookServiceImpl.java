package kr.or.ddit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.dao.BookDao;
import kr.or.ddit.service.BookService;
import kr.or.ddit.vo.CartVO;
import kr.or.ddit.vo.BookVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookServiceImpl implements BookService{
	//의존성 주입(DI)
	//제어의 역전(IoC)
	@Autowired
	BookDao bookDao;
	
	//PRODUCT 테이블에 insert
	@Override
	public int insertProduct(BookVO bookVO) {	
		return this.bookDao.insertProduct(bookVO);
	}

	// 상품 목록
	@Override
	public List<BookVO> list(String keyword) {
		return this.bookDao.list(keyword);
	}
	
	// 상품 상세보기
	@Override
	public BookVO selectDetail(BookVO bookVO) {
		return this.bookDao.selectDetail(bookVO);
	}
	
	// 상품 수정하기
	@Override
	public int update(BookVO bookVO) {
		return this.bookDao.update(bookVO);
	}
	
	// 상품 삭제하기
	@Override
	public int delete(String bookId) {
		return this.bookDao.delete(bookId);
	}

	@Override
	public int thankCustomer(CartVO cartVO) {
		// 1. CART 테이블에 insert
		int cartInCnt = this.bookDao.insertCart(cartVO);
		log.info("cartInCnt : " + cartInCnt);
		
		// 2. CART_DET 테이블에 insert
		
		return 0;
	}
}
