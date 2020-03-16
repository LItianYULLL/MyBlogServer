package com.foreknow.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class HeaderTypeFilter
 */
@WebFilter("/*")
	public class HeaderTypeFilter implements Filter {

		public HeaderTypeFilter() {
		}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// place your code here
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.setContentType("application/json");
		httpServletResponse.setHeader("Contnet-Type", "application/json");
		System.out.println("响应头信息已设置");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
