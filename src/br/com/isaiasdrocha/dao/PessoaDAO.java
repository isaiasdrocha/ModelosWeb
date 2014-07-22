package br.com.isaiasdrocha.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Component;

import br.com.isaiasdrocha.model.Pessoa;
import br.com.isaiasdrocha.util.HibernateUtil;

@Component
public class PessoaDAO {

	private final DAO<Pessoa> dao;
	private final Session session;

	public PessoaDAO(Session session) {
		dao = new DAO<Pessoa>(Pessoa.class, session);
		this.session = session;
	}
	
	public void inserePessoa(Pessoa pessoa) {
		dao.add(pessoa);
	}
	
	public Pessoa carregaPessoa(Integer id) {
		return dao.load(id);		
	}
	
	public List<Pessoa> listaPessoa() {
		return dao.list();
	}
	
	public void apagaPessoa(Pessoa pessoa) {
		dao.remove(pessoa);
	}
	
	public void update(Pessoa t) {
		dao.update(t);
	}
	
	/*
	 @SuppressWarnings("unchecked")
	public List<Cliente> pesquisaClientesDoContador(Cliente cliente, Integer contadorId) {
		Criteria criteria = this.session.createCriteria(Cliente.class).add(Restrictions.eq("contadorId", contadorId));
		if (cliente != null){
			if (cliente.getId() != null && cliente.getId() > -1){
				criteria.add(Restrictions.eq("id", cliente.getId()));
			}
			if (cliente.getCnpjCpfCei() != null && cliente.getCnpjCpfCei() != ""){
				criteria.add(Restrictions.eq("cnpjCpfCei", cliente.getCnpjCpfCei()));
			}
			if (cliente.getSituacao() != null && cliente.getSituacao() != ""){
				criteria.add(Restrictions.eq("situacao", cliente.getSituacao()));
			}
		}
		criteria.addOrder(Order.asc("razaoSocial"));
		return criteria.list();
		
	}
	 */
	
	/*public void inserir(Pessoa pessoa) {
		session = HibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();
			session.save(pessoa);
			session.getTransaction().commit();

		} finally {
			session.close();

		}
	}

	public void alterar(Pessoa pessoa) {
		session = HibernateUtil.getSessionFactory().openSession();

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(pessoa);
			session.getTransaction().commit();
		} finally {
			session.close();

		}
	}

	public void excluir(Pessoa pessoa) {
		session = HibernateUtil.getSessionFactory().openSession();

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(pessoa);
			session.getTransaction().commit();

		} finally {
			session.close();

		}
	}

	//@SuppressWarnings("unchecked")
	public List<?> listar() {
		session = HibernateUtil.getSessionFactory().openSession();

		try {
			Criteria cri = session.createCriteria(Pessoa.class);
			return cri.list();
		} finally {
			session.close();
		}
	}*/
}