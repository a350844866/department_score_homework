package com.zjdx.department_score_homework.controller;

import com.zjdx.department_score_homework.bean.User;
import com.zjdx.department_score_homework.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String doGet() {
        return "/login";
    }

    @PostMapping("/login")
    public String login(ModelMap modelMap, String loginName, String password, HttpServletResponse response, HttpServletRequest request) {
        if (StringUtils.isEmpty(loginName) || StringUtils.isEmpty(password)) {
            //表示用户名和密码为空
            modelMap.addAttribute("errorInfo", "用户名或密码不能为空");

            //跳转到用户登陆页面
            return "/login";
        }
        //通过subject进行登陆操作
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
        try {
            subject.login(token);

            //获取用户真实信息
            User user = (User) subject.getPrincipal();
            request.getSession().setAttribute("user_login", user);
            String remname = request.getParameter("remname");
            if ("true".equals(remname)) {
                Cookie cookie = new Cookie("remname", URLEncoder.encode(loginName, "utf-8"));
                cookie.setPath(request.getContextPath() + "/");
                cookie.setMaxAge(3600 * 24 * 30);
                response.addCookie(cookie);
            } else {//删除Cookie
                Cookie cookie = new Cookie("remname", "");
                cookie.setPath(request.getContextPath() + "/");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        catch(AuthenticationException | UnsupportedEncodingException e){
            e.printStackTrace();  //打印报错信息  查询真实的报错
            //表示用户名和密码不正确
            modelMap.addAttribute("errorInfo", "用户名或密码不正确");
            return "/login";
        }
        return "redirect:/score";
    }
}
