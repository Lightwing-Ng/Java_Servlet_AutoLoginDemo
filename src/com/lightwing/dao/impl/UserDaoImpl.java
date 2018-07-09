package com.lightwing.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.lightwing.dao.UserDao;
import com.lightwing.domain.UserBean;
import com.lightwing.util.JDBCUtil;

public class UserDaoImpl implements UserDao {
    @Override
    public UserBean login(UserBean user) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil.getDataSource());
        String sql = "SELECT * FROM t_user WHERE username = ? AND password = ?";
        UserBean query = runner.query(sql, new BeanHandler<UserBean>(UserBean.class), user.getUsername(), user.getPassword());
        return query;
    }
}