package com.unlaenvios;

import java.util.Calendar;

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

@Endpoint
public class PedidoEndpoint {
	private static final String NAMESPACE_URI = "http://com/unlaenvios/soap";

		private SeguimientoRepository seguimientoRepository;

		@Autowired
		public PedidoEndpoint(SeguimientoRepository seguimientoRepository) {
			this.seguimientoRepository = seguimientoRepository;
		}


		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "postSeguimientoRequest")
		@ResponsePayload
		public PostSeguimientoResponse postSeguimiento(@RequestPayload PostSeguimientoRequest request) {
			PostSeguimientoResponse response = new PostSeguimientoResponse();
			response.setEst(seguimientoRepository.findSeguimiento(request.getCodseg()).toString());
			response.setFecha(seguimientoRepository.findSeguimiento(request.getCodseg()).toString());
			return response;
		}
}
