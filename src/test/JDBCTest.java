package test;

import utils.JdbcUtils;

import java.sql.Connection;

/**
 * @author HuaHua
 * @create 2021-01-22 18:12
 */
public class JDBCTest {

    @org.junit.Test
    public void testJdbcUtils(){
        for(int i=0;i<100;i++){
            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
            JdbcUtils.close(conn);
        }
    }
}
