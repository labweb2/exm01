package br.ufjf.dcc193.exemplo01;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PessoaRepository
 */
public interface PessoaRepository extends JpaRepository<Pessoa,Long>{
    
    
}