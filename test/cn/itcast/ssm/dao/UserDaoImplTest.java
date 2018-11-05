package cn.itcast.ssm.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.po.User;

/** 
* <p>Title:spring_mybatis</p>
* <p>Description:</p>
* @author rorycheng
* @Date 2018年11月4日 下午8:58:53
* @version 1.0 
*/
public class UserDaoImplTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		//得到spring容器
	 applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById2() throws Exception{
		UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		List<User> list=userMapper.findUserById(1);
		System.out.println(list);
		
		
	}
	
	
	//Dao方法测试代码
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		List<User> list=userDao.findUserById(1);
		System.out.println(list);
	}

}
