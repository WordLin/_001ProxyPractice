package com.example.util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static SqlSessionFactory factory = null;
    static {
        String config = "mybatis-config.xml";
        InputStream in = null;
        try {
            //拿factory的代码最好不放在try catch中
             in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(in);

    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();
    public static SqlSession getSqlSession(){
        SqlSession session = t.get();
        if (session == null) {
            session = factory.openSession();
            t.set(session);
        }
        return session;
    }

    public void close(SqlSession session){
        if (session != null) {
            session.close();
        }
        t.remove();
    }
}
