package com.pls11dspcontroles.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository
;
import org.springframework.stereotype.Repository;

import com.pls11dspcontroles.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
