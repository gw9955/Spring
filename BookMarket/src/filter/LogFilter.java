package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter{

	PrintWriter writer;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Bookmarket 초기화..");
		
		String filename = filterConfig.getInitParameter("filename");
		
		if(filename == null) {
			throw new ServletException("로그 파일의 이름을 찾을 수 없습니다.");
		}
		
		try {
			writer = new PrintWriter(new FileWriter(filename, true), true);
		} catch (IOException e) {
			throw new ServletException("로그 파일을 열 수 없습니다.");
		}
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("접속한 클라이언트 IP :" +request.getRemoteAddr());
		
		 HttpServletRequest req;
		 String currentPath = "";
		 String queryString = "";
		 
		 if(request instanceof HttpServletRequest) {
			 req = (HttpServletRequest)request;
			 
			 currentPath = req.getRequestURI();
			 queryString = req.getQueryString();
			 queryString = queryString==null?"":"?" + queryString;
			 
		 }
		 
		System.out.println("접근할 URL 경로 :" + (currentPath + queryString));
		long start = System.currentTimeMillis();
		System.out.println("오청 처리 시작 시각 :" + getCurrentTime());
			
		chain.doFilter(request, response);
			
		long end = System.currentTimeMillis();
		System.out.println("오청 처리 종료 시각 :" + getCurrentTime());
		System.out.println("오청 처리 소요 시각 :" + (end-start) + "ms");
		System.out.println("=============================");
		 
	}

	@Override
	public void destroy() {
		System.out.close();
	}
	
	private String getCurrentTime() {
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		return formatter.format(calendar.getTime());
	}
	

}
