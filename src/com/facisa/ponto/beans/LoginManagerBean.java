package com.facisa.ponto.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.facisa.ponto.model.Usuario;

@ManagedBean(name="loginMgmtBean")
@RequestScoped
public class LoginManagerBean {
	
	private Usuario user = new Usuario();
	
	private boolean incorrect = false;

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public boolean isIncorrect() {
		return incorrect;
	}

	public void setIncorrect(boolean incorrect) {
		this.incorrect = incorrect;
	}
	
	public String login() {
		
		if(user.getLogin().equals("ruan")&&user.getSenha().equals("1234")){
			
			return "correct";
		}
		incorrect = true;
		return "incorrect";
		
	}

}
