package com.esen.extr.service;

import java.util.List;

import com.esen.extr.domain.user.User;
import com.esen.extr.util.Page;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午5:52:55
 */
public interface UserService {

	int addUser(User user);
	
	int addAdmin(User user);

	public List<User> getUserListByRoleId(int roleId,Page<User> page);
	
	public void updateUser(User user,String oldPassword);
	
	public User getUserById(int user_id);
	
	public void disableUser(int user_id);
}
