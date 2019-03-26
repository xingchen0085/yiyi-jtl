package com.zhku.yiyi.project.shop;

import com.zhku.yiyi.common.utils.StringUtils;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户端请求处理
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

    @RequestMapping("/index")
    public String index(){

        return "/shop/index";
    }


    @RequestMapping("/login")
    public String login(){

        return "/shop/login";
    }


    @RequestMapping("/reg")
    public String reg(){

        return "/shop/reg";
    }


    @RequestMapping("/address")
    public String address(){

        return "/shop/address";
    }


    @RequestMapping("/forget")
    public String forget(){

        return "/shop/forget";
    }


    @RequestMapping("/mygrxx")
    public String mygrxx(){

        return "/shop/mygrxx";
    }


    @RequestMapping("/myorderq")
    public String myorderq(){

        return "/shop/myorderq";
    }

    @RequestMapping("/ok")
    public String ok(){

        return "/shop/ok";
    }


    @RequestMapping("/order")
    public String order(){

        return "/shop/order";
    }


    @RequestMapping("/orderxq")
    public String orderxq(){

        return "/shop/orderxq";
    }


    @RequestMapping("/proDetail")
    public String proDetail(){

        return "/shop/proDetail";
    }


    @RequestMapping("/remima")
    public String remima(){

        return "/shop/remima";
    }


    @RequestMapping("/search")
    public String search(){

        return "/shop/search";
    }


    @RequestMapping("/wuliu")
    public String wuliu(){

        return "/shop/wuliu";
    }


    @RequestMapping("/doLogin")
    public String doLogin(ModelMap mmap, String username, String password, HttpServletRequest request){

        Object login_user = request.getSession().getAttribute("LOGIN_USER");

        if(null != login_user){
            return "/shop/index";
        }

        if("yiyi12345".equals(username) && "123456".equals(password)){
            request.getSession().setAttribute("LOGIN_USER","{'username':'yiyi12345','password':'123456'}");
            return "/shop/index";
        }
        mmap.put("error","账号或密码错误");
        return "/shop/login";
    }
}
