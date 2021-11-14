package com.unlaenvios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.unlaenvios.components.SeguimientoRepository;
import com.unlaenvios.entities.Seguimiento;
import com.unlaenvios.soap.GetSeguimientoRequest;
import com.unlaenvios.soap.GetSeguimientoResponse;
import com.unlaenvios.soap.PostSeguimientoRequest;
import com.unlaenvios.soap.PostSeguimientoResponse;
import com.unlaenvios.soap.PutSeguimientoRequest;
import com.unlaenvios.soap.PutSeguimientoResponse;

@Endpoint
public class SeguimientoEndpoint {
	private static final String NAMESPACE_URI = "http://com/unlaenvios/soap";

	private SeguimientoRepository seguimientoRepository;

	@Autowired
	public SeguimientoEndpoint(SeguimientoRepository seguimientoRepository) {
		this.seguimientoRepository = seguimientoRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSeguimientoRequest")
	@ResponsePayload
	public GetSeguimientoResponse getSeguimiento(@RequestPayload GetSeguimientoRequest request) {
		GetSeguimientoResponse response = new GetSeguimientoResponse();
		response.setSeguimiento(seguimientoRepository.findSeguimiento(request.getPedido()).toString());
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSeguimientoRequest")
	@ResponsePayload
	public PostSeguimientoResponse postSeguimiento(@RequestPayload PostSeguimientoRequest request) {
		Seg
		GetSeguimientoResponse response = new GetSeguimientoResponse();
		response.
		response.setSeguimiento(seguimientoRepository.findSeguimiento(request.getPedido()).toString());
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSeguimientoRequest")
	@ResponsePayload
	public PutSeguimientoResponse putSeguimiento(@RequestPayload PutSeguimientoRequest request) {
		Seguimiento seg = new Seguimiento(request.getPedido(), "",request.getDocdest(),0, "", "");
		GetSeguimientoResponse response = new GetSeguimientoResponse();
		response.setSeguimiento(seguimientoRepository.findSeguimiento(request.getPedido()).toString());
		return response;
	}
	

}
