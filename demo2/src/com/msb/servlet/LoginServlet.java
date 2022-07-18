package com.msb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        // 获取请求中的数据
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        // 判断数据
        String message=null;
        if(username.equals("mashibing")&& pwd.equals("123456")){
            message="Success";
        }else{
            message="Fail";
        }
        // 作出响应
        resp.getWriter().write(message);
    }
}
