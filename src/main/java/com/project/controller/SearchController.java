package com.project.controller;

import com.project.service.NameService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "searchController", urlPatterns = "/search")
public class SearchController extends HttpServlet {
    private static final long serialVersionUID = 2847786613235117603L;
    private final static Logger LOGGER = LogManager.getLogger(SearchController.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("doGet() in SearchController");
        req.getRequestDispatcher("/JSP/search-form.jsp").forward(req, resp);
    }

    private boolean isValid(String name) {
        return name != null && name.trim().length() != 0;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.debug("doPost() in SearchController: {}", req.getParameterMap());
        String name = req.getParameter("query");
        if(!isValid(name)) {
            req.setAttribute("invalid", Boolean.TRUE);
            req.getRequestDispatcher("/JSP/search-form.jsp").forward(req, resp);
            return;
        }
        String result = NameService.getInstance().convertName(name);
        req.setAttribute("name", result);
        req.getRequestDispatcher("/JSP/search-result.jsp").forward(req, resp);
    }
}
