package com.facisa.ponto.model.dao;

import java.util.List;
import com.facisa.ponto.model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import util.HibernateUtil;
 
public class UsuarioDao {
 
	private Session session; 
 
		public void inserir(Usuario usuario){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session.beginTransaction();
				session.save(usuario);
				session.getTransaction().commit();
 
			}finally{
				session.close();
 
			}
		}
 
		public void alterar(Usuario usuario){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.saveOrUpdate(usuario);
				session.getTransaction().commit();
			}finally{
				session.close();
 
			}
		}
 
		public void excluir(Usuario usuario){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.delete(usuario);
				session.getTransaction().commit();
 
			}finally{
				session.close();
 
			}
		}
 
		@SuppressWarnings("unchecked")
		public List  listar(){
			session = HibernateUtil.getSessionFactory().openSession();
 
			try{
				Criteria cri = session.createCriteria(Usuario.class);
				return cri.list();
			}finally{
				session.close();
 
			}
		}
}
