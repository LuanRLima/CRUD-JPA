package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.ContaDAO;
import dao.impl.ContaDAOImpl;
import dao.impl.EnderecoDAOImpl;
import dao.impl.PessoaDAOImpl;
import model.Conta;
import model.util.JpaUtil;

public class Principal {

	public static void main(String[] args) {

		/*EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.close();*/

		

		ContaDAOImpl contaDAOImpl = new ContaDAOImpl();
		EnderecoDAOImpl enderecoDAOImpl = new EnderecoDAOImpl();
		PessoaDAOImpl pessoaDAOImpl = new PessoaDAOImpl();
		/*System.out.println( contaDAOImpl.listaTodos().toString());*/
		/*System.out.println( enderecoDAOImpl.listaTodos().toString());*/
		System.out.println( pessoaDAOImpl.listaTodos().toString());
		
		
		

	}

}
