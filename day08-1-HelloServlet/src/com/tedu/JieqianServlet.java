package com.tedu;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class JieqianServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer qian = 10000;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();

        String money = request.getParameter("money");
        if (Integer.parseInt(money) < qian){
            printWriter.write("借钱成功！");
        }
        else {
            printWriter.write("借钱1失败");
            request.getRequestDispatcher("/Jieqian2Servlet").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
