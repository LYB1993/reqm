package com.system.reqm.websecurityconfig;

import com.system.reqm.constant.Constant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

    @Bean
    public SecurityInterceptor getInterceptor(){
        return new SecurityInterceptor();
    }
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration addInterceptor = registry.addInterceptor(getInterceptor());
        addInterceptor.excludePathPatterns("/user"+Constant.TO_ERROR_PAGE);
        addInterceptor.excludePathPatterns("/user"+Constant.TO_LOGIN_PAGE);
        addInterceptor.excludePathPatterns("/user"+Constant.TO_INDEX_PAGE);
        addInterceptor.addPathPatterns("/**");
    }
    private class SecurityInterceptor extends HandlerInterceptorAdapter{
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            //System.out.println("Path:"+request.getRequestURI());
            HttpSession session  = request.getSession();
            if(session.getAttribute(Constant.SESSION_KEY)!=null){
                return true;
            }
            response.sendRedirect("/user"+Constant.TO_LOGIN_PAGE);
            return false;
        }
    }
}
