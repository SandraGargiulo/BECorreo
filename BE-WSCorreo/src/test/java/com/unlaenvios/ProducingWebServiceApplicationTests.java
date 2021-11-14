package com.unlaenvios;


//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

//import com.unlaenvios.entities.Seguimiento;
//import com.unlaenvios.entities.Seguimiento.ESTADO;
//import com.unlaenvios.repositories.ISeguimientoRepository;

//@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProducingWebServiceApplicationTests {
	/*
	@Autowired
	private ISeguimientoRepository repository;
	
	Seguimiento correo;
	
	@BeforeEach
	public void setup() {
		correo = new Seguimiento() {
		};
	}
	
	@Test
	public void pruebaAgregarPedido() {
		correo.setIdPedido("1");
		correo.setCodSeguimiento("10");
		correo.setDocDestinatario(33221139);
		correo.setEstado(ESTADO.EN_CAMINO);
		correo.setFechaAct();
		repository.save(correo);
		Assertions.assertNotNull(correo.getIdPedido());
		
	}
	
	@Test
	public void pruebaAgregarClienteYaExiste(){
		Assertions.assertThrows(DataIntegrityViolationException.class,() ->{
			correo.setApellido("buenas");
			correo.setDni(12121213);
			correo.setEsExcento(true);
			correo.setNombre("jaja");
			repository.save(correo);	
		});
	}	
	
	
	@Test 
	public void pruebaTraerCliente() {
		Seguimiento correo = repository.findSeguimiento("10");
		Assertions.assertEquals(correo, repository.findSeguimiento("10"));
	}
	
	
	@Test 
	public void pruebaTraerClienteNoExiste() {
		Assertions.assertNull(repository.findSeguimiento("11"));
	}*/
//	@Test
//	void contextLoads() {
//	}

}
