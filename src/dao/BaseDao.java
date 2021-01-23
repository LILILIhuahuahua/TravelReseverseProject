package dao;



import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-08 11:36
 */

//抽象类：BaseDao
public abstract class BaseDao {

    //使用DButils操作数据库  (需要导入commons-dbutils-1.3-sources.jar)
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * update() 方法用来执行：Insert\Update\Delete 语句
     * @return 如果返回-1,说明执行失败<br/>返回其他表示影响的行数
     */
    public int update(String sql, Object... args) {
        //1.获取连接
        Connection connection = JdbcUtils.getConnection();
        try {
            //2.执行sql语句和相关参数ags
            // 返回影响的行数
            return queryRunner.update(connection, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //3.关闭连接
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 查询返回一个 javaBean 的 sql 语句
     *
     * @param type 返回的对象类型
     * @param sql 执行的 sql 语句
     * @param args sql 对应的参数值
     * @param <T> 返回的类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type,String sql,Object ...args){
        Connection conn = JdbcUtils.getConnection();
        try {
            //BeanHandler
            //传入什么类型的对象，就输出什么类型的对象
            return queryRunner.query(conn,sql,new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //关闭连接
            JdbcUtils.close(conn);
        }
        return null;
    }

    /**
     * 查询返回多个 javaBean 的 sql 语句
     *
     * @param type 返回的对象类型
     * @param sql 执行的 sql 语句
     * @param args sql 对应的参数值
     * @param <T> 返回的类型的泛型
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection con = JdbcUtils.getConnection();
        try {
            //BeanListHandler
            return queryRunner.query(con, sql, new BeanListHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(con);
        }
        return null;
    }

    /**
     * 执行返回一行一列的 sql 语句
     * @param sql 执行的 sql 语句
     * @param args sql 对应的参数值
     * @return
     */
    public Object queryForSingleValue(String sql, Object... args){
        Connection conn = JdbcUtils.getConnection();
        try {
            //ScalarHandler
            return queryRunner.query(conn, sql, new ScalarHandler(), args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(conn);
        }
        return null;
    }

}
