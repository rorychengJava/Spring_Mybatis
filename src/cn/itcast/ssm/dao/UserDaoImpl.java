package cn.itcast.ssm.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.ssm.po.User;

/** 
* <p>Title:Mybatis</p>
* <p>Description:</p>
* @author rorycheng
* @Date 2018年10月8日 下午10:46:00
* @version 1.0 
*/
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
	//没有注入之前，先通过构造函数直接传入参数直接新建sqlsession对象 
	//此时在spring管理下，将sqlsessionFactory交给spring去生成
	//通过继承SqlSessionDaoSupport中的sqlsessionFactory属性完成在spring配置声明注入
	
	public List<User> findUserById(int id) throws Exception {
		
		SqlSession sqlSession=this.getSqlSession();
		List<User> list=sqlSession.selectList("test.findUserById", id);
		//spring 管理后，sqlsession自动释放资源
		return list;
	}
}
