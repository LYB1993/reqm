package com.system.reqm.controller;

import com.system.reqm.constant.Constant;
import com.system.reqm.entity.Items;
import com.system.reqm.entity.User;
import com.system.reqm.mapper.ItemsMapper;
import com.system.reqm.mapper.UserMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    UserMapper userMapper;
    @Autowired
    ItemsMapper itemsMapper;
    /**
     * 跳转到主界面
     * @return
     */
    @RequestMapping(Constant.TO_INDEX_PAGE)
    public String toIndexPage(@RequestParam("userLoginName") String userLoginName, @RequestParam("userPassWord") String passWord, RedirectAttributesModelMap redirectmodel,Model
            model,HttpSession session){
        //System.out.println("userName:"+userLoginName+":passWord:"+passWord);
        User user = userMapper.selectByLoginName(userLoginName);
        if(null!=user){
            if(user.getcPassword().equals(passWord)){
                session.setAttribute(Constant.SESSION_KEY,user);
                model.addAttribute(user);
                List<Items> itemss = itemsMapper.selectAll();
                //itemss.add(itemsMapper.selectByPrimaryKey(1));
                model.addAttribute("itemss",itemss);
                logger.debug("登陆成功："+user.getcUsername());
                return Constant.INDEX_PAGE;
            }else {
                redirectmodel.addFlashAttribute(Constant.MESSAGE,"密码错误！");
                logger.debug("登陆失败：密码错误");
                return Constant.REDIRECT_LOGIN;
            }
        }else{
            redirectmodel.addFlashAttribute(Constant.MESSAGE,"账号不存在！");
            logger.debug("登陆失败：账号不存在");
            return Constant.REDIRECT_LOGIN;
        }
    }

    /**
     * 添加项目信息
     * @author lyb
     */
    @RequestMapping("/add")
    public void addItem(@ModelAttribute(value="Items") Items items){
        System.out.println(items.toString());
    }
}
