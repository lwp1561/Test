package com.msb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        // 动态生成数据
        int num = new Random().nextInt();
        String message = num % 2 == 0 ? "Happy new year!" : "Happy Birthday！";
        // 对浏览器做出响应
        PrintWriter writer = resp.getWriter();
        writer.write(message);
    }
}
