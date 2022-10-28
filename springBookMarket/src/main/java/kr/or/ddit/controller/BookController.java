package kr.or.ddit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.service.BookService;
import kr.or.ddit.vo.BookVO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView products(ModelAndView mav,
			@RequestParam(value="keyword", required=false) String keyword) {
		// Model
		List<BookVO> list = this.bookService.list(keyword);
		
		for (BookVO vo : list) {
			log.info("vo : " + vo.toString());
		}
		
		mav.setViewName("book/products");
		mav.addObject("data", list);
		
		return mav;
		
	}
	
	//URI : /addBook
	//파라미터 : none
	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public ModelAndView addBook() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("book/addBook");
		//forwarding
		return mav;
		
	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public ModelAndView addBook(ModelAndView mav, @ModelAttribute BookVO bookVO) {
		log.info("BookVO : " + bookVO.toString());
		log.info("여기는 옴");
		int result = this.bookService.insertProduct(bookVO);
		
		log.info("result : " + result);
		
		if(result > 0) {//입력 성공
			mav.setViewName("redirect:/product?bookId=" + bookVO.getBookId());
		}else {//입력 실패
			mav.setViewName("redirect:/addBook");
		}
		
		return mav;
		
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView product(ModelAndView mav, HttpSession session, @ModelAttribute BookVO bookVO) {
		log.info("product에 왔다");
		log.info("bookVO : " + bookVO.toString());
		
		BookVO data = this.bookService.selectDetail(bookVO);
		
		mav.setViewName("book/product");
		mav.addObject("data", data);
		mav.addObject("bookId", data.getBookId());
		
		return mav;
	}
//	
//	@RequestMapping(value="/update",method=RequestMethod.GET)
//	public ModelAndView update(BookVO productVO, ModelAndView mav) {
//		BookVO data = this.productService.selectDetail(productVO);
//		mav.addObject("data", data);
//		
//		mav.setViewName("product/update");
//		
//		return mav;
//	}
//	
//	@RequestMapping(value="/update",method=RequestMethod.POST)
//	public ModelAndView updatePost(@ModelAttribute BookVO productVO, ModelAndView mav) {
//		log.info("updatePost=>productVO : " + productVO.toString());
//
//		int result = this.productService.update(productVO);
//
//		if (result > 0) { // 업데이트 성공 -> 책 상세페이지(product.jsp)로 이동
//			mav.setViewName("redirect:/product?productId=" + productVO.getProductId());
//		} else { // 업데이트 실패 => 업데이트 뷰(update.jsp)로 페이지이동
//			mav.setViewName("redirect:/update?productId=" + productVO.getProductId());
//		}
//		
//		return mav;
//	}
//	
//	@RequestMapping(value="/delete",method=RequestMethod.POST)
//	public ModelAndView delete(ModelAndView mav, String productId) {
//		log.info("productId : " + productId);
//		
//		// 해당 글 삭제
//		int result = this.productService.delete(productId);
//			
//		if (result >0) { // 삭제 성공
//			// 목록으로 요청 이동(상세페이지가 없으므로)
//			mav.setViewName("redirect:/products");
//		} else {
//			// redirect => 재요청 => 88번째줄 메소드를 다시 실행한다
//			mav.setViewName("redirect:/product?productId=" + productId);
//		}
//		
//		return mav;
//	}
//	
//	// 요청 URI : /addCart
//	// 요청 파라미터 : {"productId":"P1235"}
//	// 장바구니(=세션(cartlist))에 해당 상품을 넣는다
//	// spring에서 요청파라미터를 매개변수로 받을 수 있다
//	@RequestMapping(value="/addCart",method=RequestMethod.POST)
//	public String addCart(@RequestParam String productId,
//			Model model, @ModelAttribute BookVO productVO,
//			HttpServletRequest request) {
//		log.info("productId : " + productId);
//		log.info("productVO " + productVO.toString());
//		// 장바구니에 넣을 상품이 없다면
//		if (productId==null) {
//			return "redirect:/product?productId="+productId;
//		}
//		
//		// 장바구니에 넣을 상품을 검색하자
//		BookVO vo = this.productService.selectDetail(productVO);
//		log.info("vo : " + vo);
//		
//		// 검색결과 상품 결과가 없다면
//		if (vo==null) {
//			// [상품없음] 예외처리 페이지로 이동
//			return "redirect:/exceptionNoProductId";
//		}
//		
//		// 장바구니(세션) => 세션명 : cartlist
//		HttpSession session = request.getSession();
//		// 세션에 cartlist가 있나
//		ArrayList<BookVO> list
//			= (ArrayList<BookVO>)session.getAttribute("cartlist");
//		// 장바구니가 없다면 생성하자
//		if (list==null) {
//			// list는 null이므로 여기서 리스트를 생성해야한다
//			list = new ArrayList<BookVO>();
//			// cartlist라는 세션명으로 생성
//			session.setAttribute("cartlist", list);
//		}
//		
//		// 장바구니가 있으면 다음을 실행
//		int cnt = 0; // 장바구니에 상품이 담긴 개수
//		
//		for (int i = 0; i < list.size(); i++) {
//			// list는 session 장바구니(P1234,P1235,P1236)
//			// list.get(0) => P1234상품 1행
//			// list.get(0).getProductId() => P12343
//			if (list.get(i).getProductId().equals(productId)) {
//				cnt++;
//				// 장바구니에 상품이 이미 들어있다면 장바구니에 담은 개수만 1 증가
//				list.get(i).setQuantity(list.get(i).getQuantity()+1);
//			}
//		}
//		// 장바구니에 해당 상품이 없다면
//		if (cnt==0) {
//			vo.setQuantity(1);
//			// 최종목표 : 장바구니에 상품을 추가
//			list.add(vo);
//		}
//		
//		// 장바구니 확인
//		for (BookVO pv : list) {
//			log.info("pv " + pv.toString());
//		}
//		
//		return "redirect:/product?productId="+productId;
//	}
//	
//	// 요청 URI : /cart
//	@RequestMapping(value="/cart",method=RequestMethod.GET)
//	public String cart() {
//		return "product/cart";
//	}
//	
//	//요청URI : /removeCart?productId=P1238
//	@RequestMapping(value="/removeCart",method = RequestMethod.GET)
//	public String removeCart(@RequestParam String productId, Model model, 
//			@ModelAttribute BookVO productVO, HttpServletRequest request) {
//			log.info("productId : " + productId);
//			
//			HttpSession session = request.getSession();
//			ArrayList<BookVO> cartlist =
//			(ArrayList<BookVO>)session.getAttribute("cartlist");
//			
//			for(int i=0;i<cartlist.size();i++){
//				if(cartlist.get(i).getProductId().equals(productId)){
//					cartlist.remove(cartlist.get(i));
//				}//end if
//			}//end for
//			//forwarding
//			return  "product/cart";
//			
//			//redirect
////			return "redirect:/cart";
//			
//			//메서드 호출 리턴타입이 void일 때 가능
////			this.cart();
//	}
//	
//	// 장바구니 비우기
//	// 요청URI : http://localhost/deleteCart.jsp?cartId=0E079055C0EAEFC168D164247BF31686
//	@RequestMapping(value="/deleteCart",method=RequestMethod.GET)
//	public String deleteCart(@RequestParam String cartId,
//			HttpSession session) {
//		// 요청 파라미터 cartId를 받자
//		// cartId : 0E079055C0EAEFC168D164247BF31686 <= session.getId()
//		log.info("cartId : " + cartId);	
//		
//		// cartId가 없네? => cart.jsp이동
//		if(cartId==null || cartId.trim().equals("")){
//			return "redirect:/cart";
//		}
//		
//		// 장바구니 비우기
//		//session.removeAttribute("세션명"); //=> 세션 한건만 삭제
//		session.invalidate();	//모든 세션을 삭제
//		
//		// cart.jsp로 이동
//		return "redirect:/cart";
//	}
//	
//	// 요청 URI :  /shippingInfo?cartId=0E079055C0EAEFC168D164247BF31686
//	@RequestMapping(value="/shippingInfo",method=RequestMethod.GET)
//	public String shippingInfo(@RequestParam String cartId,
//			Model model) {
//		log.info("cartId : " + cartId);
//		
//		model.addAttribute("cartId", cartId);
//		
//		//forwarding
//		return "/product/shippingInfo";
//	}
//	
//	// 요청 URI => /processShippingInfo
//	// 요청 파라미터 => 배송정보들
//	@RequestMapping(value="/processShippingInfo",method=RequestMethod.POST)
//	public String processShippingInfo(@ModelAttribute CartVO cartVO,
//			HttpServletResponse response, Model model) throws Exception {
//		Cookie cartId = 
//				new Cookie("Shipping_cartId",
//				URLEncoder.encode(cartVO.getCartId(),"UTF-8"));
//		Cookie name = 
//				new Cookie("Shipping_name",
//				URLEncoder.encode(cartVO.getName(),"UTF-8"));
//		Cookie shippingDate = 
//				new Cookie("Shipping_shippingDate",
//				URLEncoder.encode(cartVO.getShippingDate(),"UTF-8"));
//		Cookie country = 
//				new Cookie("Shipping_country",
//				URLEncoder.encode(cartVO.getCountry(),"UTF-8"));
//		Cookie zipCode = 
//				new Cookie("Shipping_zipCode",
//				URLEncoder.encode(cartVO.getZipCode(),"UTF-8"));
//		Cookie addressName = 
//				new Cookie("Shipping_addressName",
//				URLEncoder.encode(cartVO.getAddressName(),"UTF-8"));
//		Cookie addressDetail = 
//				new Cookie("Shipping_addressDetail",
//				URLEncoder.encode(cartVO.getAddressDetail(),"UTF-8"));
//		
//		//유효 기간 1일로 설정(초단위)
//		cartId.setMaxAge(24 * 60 * 60);
//		name.setMaxAge(24 * 60 * 60);
//		shippingDate.setMaxAge(24 * 60 * 60);
//		zipCode.setMaxAge(24 * 60 * 60);
//		country.setMaxAge(24 * 60 * 60);
//		addressName.setMaxAge(24 * 60 * 60);
//		addressDetail.setMaxAge(24 * 60 * 60);
//		
//		//생성된 쿠키를 등록 
//		response.addCookie(cartId);
//		response.addCookie(name);
//		response.addCookie(shippingDate);
//		response.addCookie(zipCode);
//		response.addCookie(country);
//		response.addCookie(addressName);
//		response.addCookie(addressDetail);
//		
//		model.addAttribute("cartVO", cartVO);
//		
//		// forwarding
//		return "product/orderConfirmation";
//	}
//	
//	// 배송 후 마무리. 세션 종료. 쿠키 종료.
//	// 요청 URI : /thankCustomer
//	@RequestMapping(value="/thankCustomer", method=RequestMethod.GET)
//	public String thankCustomer(HttpServletRequest request,
//			CartVO cartVO) throws Exception {
//		// 1. 쿠키 정보를 가져와 CART 테이블로 insert
//		String Shipping_name = "";
//		String Shipping_zipCode = "";
//		String Shipping_country = "";
//		String Shipping_addressName = "";
//		String Shipping_addressDetail = "";
//		String Shipping_shippingDate = "";
//		String Shipping_cartId = "";
//
//		Cookie[] cookies = request.getCookies();
//		//쿠키의 개수만큼 반복
//		for(int i=0;i<cookies.length;i++){
//			Cookie thisCookie = cookies[i];
//			//쿠키 이름 가져옴
////	 		out.print(thisCookie.getName() + "<br />");
//			//쿠키 값 가져옴
////	 		out.print(URLDecoder.decode(thisCookie.getValue(),"UTF-8")+"<br />");
//			if(thisCookie.getName().equals("Shipping_name")){
//				Shipping_name = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setName(Shipping_name);
//			}
//			if(thisCookie.getName().equals("Shipping_zipCode")){
//				Shipping_zipCode = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setZipCode(Shipping_zipCode);
//			}
//			if(thisCookie.getName().equals("Shipping_country")){
//				Shipping_country = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setCountry(Shipping_country);
//			}
//			if(thisCookie.getName().equals("Shipping_addressName")){
//				Shipping_addressName = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setAddressName(Shipping_addressName);
//			}
//			if(thisCookie.getName().equals("Shipping_addressDetail")){
//				Shipping_addressDetail = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setAddressDetail(Shipping_addressDetail);
//			}
//			if(thisCookie.getName().equals("Shipping_shippingDate")){
//				Shipping_shippingDate = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setShippingDate(Shipping_shippingDate);
//			}
//			if(thisCookie.getName().equals("Shipping_cartId")){
//				Shipping_cartId = URLDecoder.decode(thisCookie.getValue(),"UTF-8");
//				cartVO.setCartId(Shipping_cartId);
//			}
//		}
//		
//		log.info("cartVO : " + cartVO.toString());
//		
//		// 2. 세션 정보를 가져와 CART_DET 테이블로 다중 insert
//		HttpSession session = request.getSession();
//		ArrayList<BookVO> list
//			= (ArrayList<BookVO>)session.getAttribute("cartlist");
//		
//		// 3. CartVO : CartDetVO = 1 : N
//		List<CartDetVO> cartDetVOList = new ArrayList<CartDetVO>();
//		for (BookVO vo : list) {
//			CartDetVO cartDetVO = new CartDetVO();
//			cartDetVO.setCartId(cartVO.getCartId());
//			cartDetVO.setProductId(vo.getProductId());
//			cartDetVO.setUnitPrice(vo.getUnitPrice());
//			cartDetVO.setQuantity(vo.getQuantity());
//			cartDetVO.setAmount(vo.getUnitPrice() * vo.getQuantity());
//			
//			cartDetVOList.add(cartDetVO);
//		}
//		cartVO.setCartDetVOList(cartDetVOList);
//		
//		log.info("cartVO : " + cartVO.toString());
//		
//		this.productService.thankCustomer(cartVO);
//		
//		// forwarding
//		return "product/thankCustomer";
//	}
//	
//	// 주문 취소
//	// 요청 URI : /checkOutCancelled
//	// 목적 : 세션 종료
//	@RequestMapping(value="/checkOutCancelled", method=RequestMethod.GET)
//	public String checkOutCancelled() {
//		// forwarding
//		return "product/checkOutCancelled";
//	}
}
