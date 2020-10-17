package br.pucminas.model.dao;

import org.springframework.stereotype.Repository;

import br.pucminas.model.entity.Categoria;

@Repository
public class CategoriaDao extends AbstractDao<Categoria, Long> implements ICategoriaDao {

}
