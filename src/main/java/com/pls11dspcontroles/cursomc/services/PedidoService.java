package com.pls11dspcontroles.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pls11dspcontroles.cursomc.domain.Pedido;
import com.pls11dspcontroles.cursomc.repositories.PedidoRepository;
import com.pls11dspcontroles.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) { 
		 Optional<Pedido> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName())); 
		} 
}
