package com.lightwing.servlet;

import com.lightwing.dao.UserDao;
import com.lightwing.dao.impl.UserDaoImpl;
import com.lightwing.domain.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        try {
            String userName = request.getParameter("username");
            String password = request.getParameter("password");
            String autoLogin = request.getParameter("auto_login");
            UserBean user = new UserBean();
            user.setUsername(userName);
            user.setPassword(password);
            UserDao dao = new UserDaoImpl();
            UserBean userBean = dao.login(user);

            if (userBean != null) {
                if ("on".equals(autoLogin)) {
                    // 发送 cookie 到客户端
                    Cookie cookie = new Cookie("auto_login", userName + "#itheima#" + password);
                    cookie.setMaxAge(60 * 60 * 24 * 7); // 7天有效期
                    cookie.setPath("/AutoLoginDemo");
                    response.addCookie(cookie);
                }
                // 成功，进入首页
                request.getSession().setAttribute("userBean", userBean);
                response.sendRedirect("index.jsp");
            } else {
                // 失败
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
