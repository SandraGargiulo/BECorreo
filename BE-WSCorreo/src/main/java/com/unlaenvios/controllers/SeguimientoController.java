package com.unlaenvios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unlaenvios.entities.Seguimiento;
import com.unlaenvios.services.SeguimientoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("/Seguimiento")
public class SeguimientoController {
	@Autowired
	private SeguimientoService sService;
	/*
	// GET Envios: devuelve datos de una lista de envios
		@RequestMapping(value = "/seguimiento/{idpedido}", method = RequestMethod.GET)
	    @ApiOperation(value = "traer lista de seguimiento", response = Seguimiento.class)
	    public Seguimiento listarSeguimiento() {
	        List <seg> Seguimiento  = sService.initData();
	        return seg;
	    }*/
	
	// GET Envios: devuelve datos de un envio puntual
	@RequestMapping(value = "/seguimiento/{idpedido}", method = RequestMethod.GET)
    @ApiOperation(value = "buscar codigo de seguimiento", response = Seguimiento.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public Seguimiento encontrarSeguimiento(@PathVariable("idpedido") String idPedido) {
        Seguimiento seg = sService.encontrarEnvio(idPedido);
        return seg;
    }
	
	// POST Estado: cambiar el estado del seguimiento
	@RequestMapping(value = "/seguimiento/{codSeguimiento}", method = RequestMethod.POST)
    @ApiOperation(value = "modificar el estado de seguimiento de un pedido", response = Seguimiento.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public Seguimiento cambiarEstado(@PathVariable("codSeguimiento") String codSeguimiento) {
		Seguimiento seg = sService.cambiarEstado(codSeguimiento);
        return seg;
	}
    
	// PUT Seguimiento: Insertar nuevo seguimiento de un pedido
	@RequestMapping(value = "/seguimiento/", method = RequestMethod.PUT)
    @ApiOperation(value = "crear un nuevop seguimiento de pedido", response = Seguimiento.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public Seguimiento nuevoSeguimiento(@RequestBody int docDestinatario, @RequestBody String idPedido) {
		Seguimiento seg = sService.nuevoSeguimiento(docDestinatario, idPedido);
        return seg;
    }
	
}
