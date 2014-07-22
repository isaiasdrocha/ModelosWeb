package br.com.isaiasdrocha.dao;

import java.util.List;

import org.hibernate.Session;

public class DAO<T> {
	
	private final Class<T> classe;
	private final Session session;
	
	public DAO(Class<T> classe, Session session) {
		this.classe = classe;
		this.session = session;
	}
	
	public void update(T t) {
		session.merge(t);
	}

	public void add(T t) {
		session.save(t);
	}
	
	public void remove(T t) {
		session.delete(t);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> list() {
		return session.createCriteria(classe).list();
	}
	
	@SuppressWarnings("unchecked")
	public T load(Integer id) {
		return (T)session.get(classe, id);		
	}

}