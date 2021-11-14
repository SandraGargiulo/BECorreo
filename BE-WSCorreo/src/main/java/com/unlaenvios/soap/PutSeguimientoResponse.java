package com.unlaenvios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docdest", "pedido"
})
@XmlRootElement(name = "putSeguimientoResponse")
public class PutSeguimientoResponse {
    @XmlElement(name = "nseguimiento", required = true)
    protected Seguimiento nseguimiento;

	public Seguimiento getNseguimiento() {
		return nseguimiento;
	}

	public void setNseguimiento(Seguimiento nseguimiento) {
		this.nseguimiento = nseguimiento;
	}
    
}
