package br.com.julialopes.dao;

import org.springframework.stereotype.Repository;

import br.com.julialopes.domain.Empresa;

@Repository
public class EmpresaDaoImpl extends AbstractDao<Empresa, Long> implements EmpresaDao {

}
