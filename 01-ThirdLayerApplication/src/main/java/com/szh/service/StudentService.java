package com.szh.service;

import com.szh.entity.Student;
import com.szh.vo.PageInfo;

// 业务层接口
public interface StudentService {
    PageInfo<Student> getPageInfo(int pageNo, int pageSize);
}
