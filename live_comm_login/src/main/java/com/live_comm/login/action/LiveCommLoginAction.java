package com.live_comm.login.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping(value = "liveComm")
public class LiveCommLoginAction {
    //    Logger logger = LoggerFactory.getLogger(LiveCommLoginAction.class);
    public static final String LOGIN_JSP = "login/index";
    public static final String INDEX_HTML = "page/login.html";


    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpSession session) {
        System.out.println("****************8888************8888");

        return "redirect:" + INDEX_HTML;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
        return LOGIN_JSP;
    }

    @RequestMapping(value = "testForward", method = RequestMethod.GET)
    public void testForward(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        // forward必须是本机资源
        request.getRequestDispatcher("/liveComm/testRedirect").forward(request, response);

    }

    @RequestMapping(value = "testRedirect", method = RequestMethod.GET)
    public void test(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        response.sendRedirect("https://www.baidu.com");
    }
}
