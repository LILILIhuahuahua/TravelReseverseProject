package utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author HuaHua
 * @create 2021-01-22 17:13
 */
public class JdbcUtils {
    //资源池
    private static DruidDataSource dataSource;

    //使用静态代码块，随着JdbcUtils类的加载，对资源池进行初始化
    static{
        Properties properties = new Properties();
        // 读取 jdbc.properties 属性配置文件
        InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");

        try {
            // 从流中加载数据
            properties.load(inputStream);

            //创建资源池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //获取数据库连接池中的连接
    public static Connection getConnection(){
        Connection conn = null;

        try {
            //从资源池中获取连接
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }

    //关闭数据库连接池中的连接
    public static  void close(Connection conn){
        if (conn != null) {
            try {
                //关闭连接
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
