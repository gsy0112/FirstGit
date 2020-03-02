package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao{

	@Override
	public void save(User user) {
		// 创建一个集合保存用户信息
		List<User> list = new ArrayList<User>();
		list.add(user);
		for(User user2 : list) {
		System.out.println(user2.getName()+","
				+user2.getAge());
		}
			
	}

	@Override
	public void update(User user) {
		System.out.println("执行修改用户信息的操作");
	}
	
}
