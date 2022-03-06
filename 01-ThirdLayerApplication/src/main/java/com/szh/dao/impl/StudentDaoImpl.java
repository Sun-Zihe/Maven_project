package com.szh.dao.impl;

import com.szh.dao.StudentDao;
import com.szh.entity.Student;
import com.szh.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    QueryRunner queryRunner = new QueryRunner();

    Connection connection = DruidUtil.getConnection();

    // 获取总数据量
    @Override
    public int getTotalCount() {
        String sql = "select * from student";

        List<Student> list = null;
        try {
            list = queryRunner.query(connection, sql, new BeanListHandler<>(Student.class));
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        if (list != null) {
            return list.size();
        }

        return 0;
    }

    @Override
    public List<Student> getList(int pageNo, int pageSize) {
        String sql = "select * from student limit ?, ?";

        // 从哪开始
        int start = (pageNo - 1) * pageSize;

        // 查多少条pageSize

        List<Student> list = null;

        try {
            list = queryRunner.query(connection, sql, new BeanListHandler<>(Student.class), start, pageSize);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        return list;
    }
}
