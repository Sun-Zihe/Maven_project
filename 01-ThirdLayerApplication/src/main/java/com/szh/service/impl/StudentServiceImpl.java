package com.szh.service.impl;

import com.szh.dao.StudentDao;
import com.szh.dao.impl.StudentDaoImpl;
import com.szh.entity.Student;
import com.szh.service.StudentService;
import com.szh.vo.PageInfo;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    // 业务逻辑层依赖数据访问层
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public PageInfo<Student> getPageInfo(int pageNo, int pageSize) {
        int totalCount = studentDao.getTotalCount();
        List<Student> list = studentDao.getList(pageNo, pageSize);

        return new PageInfo<>(totalCount, pageSize, pageNo, list);
    }
}
