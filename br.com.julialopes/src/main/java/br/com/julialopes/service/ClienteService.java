package br.com.julialopes.service;

import java.time.LocalDate;
import java.util.List;

import br.com.julialopes.domain.Cliente;

public interface ClienteService {

		
		void salvar(Cliente cliente);
		
		void editar(Cliente cliente);
		
		void excluir(Long id);
		
		Cliente buscarPorId(Long id);
		
		List<Cliente> buscarTodos();
		
		List<Cliente> buscarPorNome(String nome);
		
		List<Cliente> buscarPorProfissao(Integer profissao);
		
		List<Cliente> buscarPorData(LocalDate data);
	}
