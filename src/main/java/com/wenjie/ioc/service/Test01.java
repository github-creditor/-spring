package com.wenjie.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;
@Scope("singleton")     /*指定bean的作用范围，是单例的还是多例的*/
@Component("test01")
public class Test01 {

    @Autowired          //
    @Qualifier("date") /*   在按照类型注入的基础之上再按照名称注入。
                            它在给类成员注入时不能单独使用，必须和 @Autowired 一起使用。
                             但是在给方法参数注入时可以单独使用。*/
    private Date da;


    @Resource(name="Id")    /*直接按照 Bean 的 Id 进行注入，它可以独立使用。
                            如果报错 Cannot resolve symbol 'Resource' ，那么导入javax.annotation 的依赖即可
    */
    private  Date dat;

    @Value("使用这一个注解注入str")
    private String str;


    @PostConstruct      //创建的时候执行难
    public void init(){
        System.out.println("这个是初始方法");
    }


    @PreDestroy
    public void destroy(){  //销毁的时候执行
        System.out.println("这个是销毁方法");
    }


    public Date getDa() {
        return da;
    }

    public void setDa(Date da) {
        this.da = da;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
