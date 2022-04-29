package com.fc.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 使用注解实现过滤器功能
 * 当然还可以使用配置类来实现过滤
 * 这样也方便管理和可读性更强
 */
//@WebFilter("/*")
//@Component
//优先级
//@Order(1)
public class MoneyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤条件前：只要有钱的");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("过滤条件后：很有钱");
    }
}
