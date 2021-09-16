package dao;

import java.util.List;

import model.Endereco;

public interface EnderecoDAO {

	public void salvar(Endereco endereco);
	public void altera(Endereco endereco);
	public void remover(Integer numero);
	public Endereco pesquisar(Integer id);
	public List<Endereco> listaTodos();
	
	
}
