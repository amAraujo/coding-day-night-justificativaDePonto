package com.facisa.ponto.beans;
 
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
 
import com.facisa.ponto.model.Usuario;
import com.facisa.ponto.model.dao.UsuarioDao;
 
@ManagedBean(name="usuarioBean")
@ViewScoped
public class UsuarioManagerBean {
 
	Usuario usuario = new Usuario();
 
	List usuarios = new ArrayList(); 
 
	//construtor
	public UsuarioManagerBean(){
		usuarios = new UsuarioDao().listar();
		usuario = new Usuario();
	}
 
	//Métodos dos botões 
	public void cadastrar(ActionEvent actionEvent){
		new UsuarioDao().inserir(usuario);
		usuarios = new UsuarioDao().listar();
		usuario = new Usuario();
	}
 
	public void alterar(ActionEvent actionEvent){
		new UsuarioDao().alterar(usuario);
		usuarios = new UsuarioDao().listar();
		usuario = new Usuario();
	}
	public void excluir(ActionEvent actionEvent){
		new UsuarioDao().excluir(usuario);
		usuarios = new UsuarioDao().listar();
		usuario = new Usuario();
	}
 
	//getters and setters
	public Usuario getUsuario() {
		return usuario;
	}
 
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
 
	public List getUsuarios() {
		return usuarios;
	}
 
	public void setUsuarios(List usuarios) {
		this.usuarios = usuarios;
	}
}