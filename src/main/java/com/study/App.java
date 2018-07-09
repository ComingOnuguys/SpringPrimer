package com.study;

import com.study.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
        ProductService productService = (ProductService) context.getBean("productServiceImpl");
        String productname = productService.queryProductNameById("23333");
        System.out.println("productname = " + productname);
    }
}
