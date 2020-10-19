package br.pucminas.model.dao;

import org.springframework.stereotype.Repository;

import br.pucminas.model.entity.Despesa;

@Repository
public class DespesaDao  extends AbstractDao<Despesa, Long> implements IDespesaDao {

}
