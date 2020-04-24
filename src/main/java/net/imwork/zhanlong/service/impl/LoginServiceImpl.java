package net.imwork.zhanlong.service.impl;

import net.imwork.zhanlong.service.LoginService;

public class LoginServiceImpl implements LoginService
{
    @Override
    public boolean isLogin(String username, String password)
    {
        if ("zhanlong".equals(username) && "m123".equals(password))
        {
            return true;
        }
        return false;
    }
}
