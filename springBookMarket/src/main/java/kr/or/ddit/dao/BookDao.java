package kr.or.ddit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.ddit.vo.CartVO;
import kr.or.ddit.vo.BookVO;

@Repository
public class BookDao {
	// 의존성 주입(Dependency Injection-DI)
	// 제어의 역전(Inversion of Control - IoC)
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	// PRODUCT 테이블에 insert
	public int insertProduct(BookVO bookVO) {
		// .insert("namespace.id",파라미터)
		return sqlSessionTemplate.insert("book.insert", bookVO);
	}

	// 상품 목록
	public List<BookVO> list(String keyword) {
		return this.sqlSessionTemplate.selectList("book.list", keyword);
	}

	// 상품 상세보기
	public BookVO selectDetail(BookVO bookVO) {
		return this.sqlSessionTemplate.selectOne("book.select_detail", bookVO);
	}
	
	// 상품 수정하기
	public int update(BookVO bookVO) {
		return this.sqlSessionTemplate.update("book.update",bookVO);
	}
	
	// 상품 삭제하기
	public int delete(String bookId) {
		return this.sqlSessionTemplate.delete("book.delete",bookId);
	}
	
	// CART 테이블에 insert
	public int insertCart(CartVO cartVO) {
		return this.sqlSessionTemplate.insert("book.insertCart",cartVO);
	}
}
