package com.szh.test;


import com.szh.dao.AccountDao;
import com.szh.entity.Account;
import com.szh.entity.TAccount;
import com.szh.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {
@Test
    public  void testCamelCase(){
    AccountDao accountDao = MyBatisUtil.getMapper(AccountDao.class);
    List<TAccount> accounts = accountDao.findAllByCamelCase();
    for (TAccount account : accounts) {
        System.out.println(account);
    }
    MyBatisUtil.commit();
}

    @Test
    public void testMap() {
        AccountDao accountDao = MyBatisUtil.getMapper(AccountDao.class);

        Account account = accountDao.findById(1);

        System.out.println(account);

        MyBatisUtil.commit();
    }

}
