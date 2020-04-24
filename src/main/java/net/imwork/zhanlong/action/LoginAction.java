package net.imwork.zhanlong.action;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.service.LoginService;

public class LoginAction extends ActionSupport
{
    private String username;
    private String password;

    private LoginService service;

    public void setService(LoginService service)
    {
        this.service = service;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }


    @Override
    public String execute() throws Exception
    {
        //原来的方式（就是没有spring的情况下）
//        LoginService loginService = new LoginServiceImpl();
//        if (loginService.isLogin(username, password))
//        {
//            return SUCCESS;
//        }else
//        {
//            return ERROR;
//        }
        //现在通过spring进行管理
        System.out.println(service.getClass().getName());
        if (service.isLogin(username, password))
        {
            return SUCCESS;
        }else
        {
            return ERROR;
        }
    }
}
