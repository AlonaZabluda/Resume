package com.project.filter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@WebFilter(urlPatterns = "/*")
public class ApplicationFilter implements Filter {
    private static final Logger LOGGER = LogManager.getLogger(ApplicationFilter.class);
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        LOGGER.debug("Before URL processing: {}", req.getRequestURI());
        chain.doFilter(req, response);
        LOGGER.debug("After URL processing: {}", req.getRequestURI());
    }

    public void destroy() {

    }
}