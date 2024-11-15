package com.zgm.model.Dao;

import java.sql.Connection;

/**
 * 基本Dao接口
 * 定义数据库连接与关闭
 */
public interface Dao {
    /**
     * 建立数据库连接
     * @return Connection类对象
     */
    Connection getConnection();

    /** 关闭数据库连接 */
    void close();
}
