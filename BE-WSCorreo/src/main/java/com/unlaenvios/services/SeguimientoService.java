package com.unlaenvios.services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.unlaenvios.entities.Seguimiento;
import com.unlaenvios.repositories.ISeguimientoRepository;

@Service
public class SeguimientoService {
	
	private ISeguimientoRepository seguimientoRepository;

	public List<Seguimiento> getAll() {
		return seguimientoRepository.findAll();
	}

	public void save(Seguimiento correo) {
		seguimientoRepository.save(correo);
	}

	// GET
	public Seguimiento encontrarEnvio(@Param("idPedido") String idPedido) {
		return seguimientoRepository.findSeguimiento(idPedido);
	}
	
	// POST
	public Seguimiento cambiarEstado(@Param("codSeguimiento") String codSeguimiento) {
		return seguimientoRepository.changeEstado(codSeguimiento);
	}
	
	// PUT
	public Seguimiento nuevoSeguimiento(@Param("docDestinatario") int docDestinatario, @Param("idPedido") String idPedido) {
		return seguimientoRepository.newSeguimiento(docDestinatario, idPedido);
	}
}