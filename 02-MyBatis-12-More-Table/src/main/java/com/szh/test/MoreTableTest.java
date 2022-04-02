package com.szh.test;

import com.szh.dao.EmployeeDao;
import com.szh.entity.Employee;
import com.szh.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class MoreTableTest {
    @Test
    public void test() {
        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);

        List<Employee> employees = employeeDao.findAll();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        MyBatisUtil.commit();
    }
}
