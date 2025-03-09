package com.vehical;

public interface IUser {

	//boolean register(User user,int index);
	boolean login(String username,String password);
	boolean register(User user);

}
