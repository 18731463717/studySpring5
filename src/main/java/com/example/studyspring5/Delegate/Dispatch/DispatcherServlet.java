package com.example.studyspring5.Delegate.Dispatch;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 11:39
 */
//相当于项目经理的角色
public class DispatcherServlet extends HttpServlet {
    private void doDisPatch(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String url = request.getRequestURI();
        String mid = request.getParameter("mid");

        if("getMemberById".equals(url)){
            new MemberController().getMemberById(mid);
        }else if("getOrderById".equals(url)){
            new OrderController().getOrderById(mid);
        }else if("logout".equals(url)){
            new SystemController().logout();
        }else {
            response.getWriter().write("404 Not Found!");
        }
    }

    protected void service(HttpServletRequest request,HttpServletResponse response)
            throws ServletException , IOException
    {
        try {
            doDisPatch(request,response);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
