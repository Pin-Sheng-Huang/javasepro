package com.com.test.web;

import com.com.test.config.SpringConfiguration;
import com.com.test.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-06 20:52
 * @LastEditTime: 2023-07-06 20:52
 */
//@SpringBootApplication
//@Controller
public class UserController {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext  app = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserService us = app.getBean(UserService.class);
        us.save();
        app.close();
    }

    @WebServlet("/home")
    public class HomeServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // 处理主页的请求逻辑
        }
    }

    @WebServlet("/profile")
    public class ProfileServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // 处理用户配置文件的请求逻辑
        }
    }

    @WebServlet("/products")
    public class ProductsServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // 处理产品列表的请求逻辑
        }
    }

}
