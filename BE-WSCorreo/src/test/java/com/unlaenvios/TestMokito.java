package com.unlaenvios;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.unlaenvios.entities.Seguimiento;
import com.unlaenvios.entities.Seguimiento.ESTADO;
import com.unlaenvios.repositories.ISeguimientoRepository;


public class TestMokito {
	@Autowired
	private ISeguimientoRepository repository = Mockito.mock(ISeguimientoRepository.class);
	
//	@BeforeEach
	public void setup1() {
		Seguimiento correoMock = new Seguimiento() {
		};
		correoMock.setIdPedido("321");
		correoMock.setCodSeguimiento("123");
		correoMock.setDocDestinatario(13111111);
		correoMock.setEstado(ESTADO.DESPACHADO);
		correoMock.setFechaAct(null);;
	Mockito.when(repository.findSeguimiento("123")).thenReturn(correoMock);

	}
	/*
	@BeforeEach
	public void setup2() {
		Seguimiento clienteMock = new Seguimiento();
		clienteMock.setApellido("Gomez");
		clienteMock.setNombre("Juan");
		clienteMock.setDni(12111000);
		clienteMock.setEsExcento(false);
		Seguimiento clienteMock2 = new Seguimiento();
		clienteMock2.setApellido("Gonzalez");
		clienteMock2.setNombre("Nahu");
		clienteMock2.setDni(13111122);
		clienteMock2.setEsExcento(true);
		List<Seguimiento> lista = new ArrayList<Seguimiento>();
		lista.add(clienteMock);
		lista.add(clienteMock2);
	Mockito.when(repository.findAll()).thenReturn(lista);
	}
	
	
	@Test
	public void pruebaDetalles() {
		Seguimiento correoPrueba = repository.findSeguimiento(null);
		Assertions.assertEquals();
		Assertions.assertEquals();
		Assertions.assertEquals();
		Assertions.assertEquals();	
	}
	
	@Test
	public void pruebaLista() {
		List<Seguimiento> lista = repository.findAll();
		Assertions.assertEquals(2, lista.size());
		Assertions.assertEquals();
	}*/
	
}
