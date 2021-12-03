package br.com.julialopes.dao;

import java.util.List;

import br.com.julialopes.domain.Profissao;

public interface ProfissaoDao {
	
	void save(Profissao profissao);
	
	void update(Profissao profissao);
	
	void delete(Long id);
	
	Profissao findById(Long id);
	
	List<Profissao> findAll();
	
	

}
