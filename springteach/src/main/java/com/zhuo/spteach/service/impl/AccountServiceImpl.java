package com.zhuo.spteach.service.impl;


import com.zhuo.spteach.dao.IAccountDao;
import com.zhuo.spteach.dao.impl.AccountDaoImpl;
import com.zhuo.spteach.service.IAccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    //private IAccountDao accountDao=new AccountDaoImpl();//此时还没有解耦
  /*  private IAccountDao accountDao;//通过spring解耦了
    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void  saveAccount(){
        accountDao.saveAccount();
    }*/

    //如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name,Integer age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void  saveAccount(){
        System.out.println("service中的saveAccount方法执行了。。。"+name+","+age+","+birthday);
    }
}
