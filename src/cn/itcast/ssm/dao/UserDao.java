package cn.itcast.ssm.dao;
/** 
* <p>Title:Mybatis</p>
* <p>Description:查询增删Dao接口方法</p>
* @author rorycheng
* @Date 2018年10月8日 下午10:26:13
* @version 1.0 
*/

import java.util.List;

import cn.itcast.ssm.po.User;

public interface UserDao {
		
	//根据id查询用户信息
	public List<User> findUserById(int id) throws Exception;
	
}
