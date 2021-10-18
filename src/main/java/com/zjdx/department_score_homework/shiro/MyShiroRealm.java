package com.zjdx.department_score_homework.shiro;


import com.zjdx.department_score_homework.bean.User;
import com.zjdx.department_score_homework.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class MyShiroRealm extends AuthorizingRealm{

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken loginToken = (UsernamePasswordToken) token;
        String username = loginToken.getUsername();
        String password = String.valueOf(loginToken.getPassword());
        //通过用户名查询用户信息
        User user = userService.findUserByU_P(username,password);
        if (null == user) {
            return null;
        }
        /**
         * 1.principal  真实的用户对象
         * 2.credentials  真实的密码
         * 3.realmName    当前realm的名称
         */
        AuthenticationInfo info =
                new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());

        return info;
    }
}
