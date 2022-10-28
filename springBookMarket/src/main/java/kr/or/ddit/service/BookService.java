package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.CartVO;
import kr.or.ddit.vo.BookVO;

public interface BookService {
	// 메소드 시그니처
	
	// PRODUCT 테이블에 insert
	public int insertProduct(BookVO bookVO);

	// 상품 목록
	public List<BookVO> list(String keyword);

	// 상품 상세보기
	public BookVO selectDetail(BookVO bookVO);

	// 상품 수정
	public int update(BookVO bookVO);

	// 상품 삭제
	public int delete(String bookId);

	// CART 및 CART_DET 테이블에 insert
	public int thankCustomer(CartVO cartVO);
	
}
