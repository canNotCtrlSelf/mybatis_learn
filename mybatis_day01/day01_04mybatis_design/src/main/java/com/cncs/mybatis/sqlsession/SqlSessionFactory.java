package com.cncs.mybatis.sqlsession;

public interface SqlSessionFactory {
    /**
     * 打开一个新的SqlSession对象
     * @return
     */
    public SqlSession openSession();
}
