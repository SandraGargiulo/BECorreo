package com.unlaenvios;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.unlaenvios.controllers.SeguimientoController;
import com.unlaenvios.services.SeguimientoService;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ControllersTest {
	@Autowired
	private SeguimientoService seguimientoService = Mockito.mock(SeguimientoService.class);
	@Autowired
	SeguimientoController seguimientoController = new SeguimientoController();

}
