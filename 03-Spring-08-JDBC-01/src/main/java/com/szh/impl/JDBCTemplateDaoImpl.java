package com.szh.impl;

import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateDaoImpl {

    private JdbcTemplate jdbcTemplate;

    public int delete(Integer id){
        String sql = "delete from user where id = ?";

        int update = jdbcTemplate.update(sql, id);

        return update;
    }



    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
