package dao;

import java.util.List;

import model.Conta;

public interface ContaDAO {
	
	public void salvar(Conta conta);
	public void altera(Conta conta);
	public void remover(Integer numero);
	public Conta pesquisar(Integer numero);
	public List<Conta> listaTodos();

}
