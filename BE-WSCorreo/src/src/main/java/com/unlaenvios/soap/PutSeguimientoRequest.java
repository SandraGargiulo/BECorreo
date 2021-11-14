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
@XmlRootElement(name = "putSeguimientoRequest")
public class PutSeguimientoRequest {

    @XmlElement(name = "docdest", required = true)
    protected String docdest;
    
    @XmlElement(name = "pedido", required = true)
    protected String pedido;
    
	public String getDocdest() {
		return docdest;
	}
	public void setDocdest(String docdest) {
		this.docdest = docdest;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
}
