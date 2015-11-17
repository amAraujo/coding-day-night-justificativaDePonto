package com.facisa.protocolo.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.facisa.protocolo.model.User;

@ManagedBean(name="loginMgmtBean")
@RequestScoped
public class LoginManagerBean {
	
	private User user = new User();
	
	private boolean incorrect = false;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isIncorrect() {
		return incorrect;
	}

	public void setIncorrect(boolean incorrect) {
		this.incorrect = incorrect;
	}
	
	public String login() {
		
		if(user.getUsername().equals("ruan")&&user.getPassword().equals("1234")){
			
			return "correct";
		}
		incorrect = true;
		return "incorrect";
		
	}

}
