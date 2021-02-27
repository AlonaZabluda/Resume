package com.project.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ApplicationListener implements ServletContextListener {
    private static final Logger LOGGER = LogManager.getLogger(ApplicationListener.class);


    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("Application started");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("Application destroyed");
    }

}