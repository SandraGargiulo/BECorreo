package com.unlaenvios.components;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import com.unlaenvios.entities.Seguimiento;
import com.unlaenvios.entities.Seguimiento.ESTADO;

import org.springframework.util.Assert;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Component
public class SeguimientoRepository {
	private static final Map<String, Seguimiento> seguimientos = new HashMap<>();

	@PostConstruct
	public void initData() {
		Seguimiento envio1 = new Seguimiento() {};
		envio1.setIdPedido("40");
		envio1.setCodSeguimiento("50");
		envio1.setDocDestinatario(12344321);
		envio1.setEstado(ESTADO.EN_CAMINO);
		envio1.setFechaAct(Calendar.getInstance().toString());
		seguimientos.put(envio1.getCodSeguimiento(),envio1);

		Seguimiento envio2 = new Seguimiento() {};
		envio2.setIdPedido("41");
		envio2.setCodSeguimiento("49");
		envio2.setDocDestinatario(11112222);
		envio2.setEstado(ESTADO.ENTREGADO);
		envio2.setFechaAct(Calendar.getInstance().toString());
		seguimientos.put(envio2.getCodSeguimiento(),envio2);

		Seguimiento envio3 = new Seguimiento() {};
		envio3.setIdPedido("42");
		envio3.setCodSeguimiento("48");
		envio3.setDocDestinatario(11222333);
		envio3.setEstado(ESTADO.DESPACHADO);
		envio3.setFechaAct(Calendar.getInstance().toString());		
		seguimientos.put(envio3.getCodSeguimiento(),envio3);
	}
	
	public Seguimiento findSeguimiento(String idPedido) {
		Assert.notNull(idPedido, "El pedido no puede ser nulo");
		return seguimientos.get(idPedido);
	}
	
	public Seguimiento changeEstado(String codSeguimiento) {
		Assert.notNull(codSeguimiento, "El seguimiento no puede ser nulo");
		return seguimientos.get(codSeguimiento);
	}
	
	public Seguimiento newSeguimiento(int docDestinatario, String idPedido) {
		Assert.notNull(docDestinatario, "El DNI del cliente no puede ser nulo");
		Assert.notNull(idPedido, "El pedido no puede ser nulo");
		return seguimientos.get(idPedido);
	}
}
