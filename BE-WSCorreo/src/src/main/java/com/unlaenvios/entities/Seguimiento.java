package com.unlaenvios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "seguimiento", uniqueConstraints = { @UniqueConstraint(columnNames = { "codSeguimiento" }) })
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Seguimiento {
	
	public enum ESTADO{EN_PREPARACION, DESPACHADO, EN_CAMINO, ENTREGADO;}

	@Column(name = "idpedido")
	@NotEmpty(message = "Definir DNI del destinatario")
	protected String idPedido;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected String codSeguimiento;

	@Column(name = "docDestinatario")
	@NotEmpty(message = "Definir DNI del destinatario")
	protected int docDestinatario;

	@Column(name = "estado")
	@NotEmpty(message = "Definir estado del pedido")
	protected ESTADO estado;

	@Column(name = "fecha")
	protected String fechaAct;

	public Seguimiento () {
		super();
	}

	public Seguimiento (String idPedido, String codSeguimiento, int docDestinatario, ESTADO estado, String fechaAct) {
		this.idPedido = idPedido;
		this.codSeguimiento = codSeguimiento;
		this.docDestinatario = docDestinatario;
		this.estado = estado;
		this.fechaAct = fechaAct;
	}

	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public String getCodSeguimiento() {
		return codSeguimiento;
	}
	public void setCodSeguimiento(String codSeguimiento) {
		this.codSeguimiento = codSeguimiento;
	}
	public int getDocDestinatario() {
		return docDestinatario;
	}
	public void setDocDestinatario(int docDestinatario) {
		this.docDestinatario = docDestinatario;
	}
	public ESTADO getEstado() {
		return estado;
	}
	public void setEstado(ESTADO estado) {
		this.estado = estado;
	}
	public String getFechaAct() {
		return fechaAct;
	}
	public void setFechaAct(String fechaAct) {
		this.fechaAct = fechaAct;
	}
	@Override
	public String toString() {
		return "Seguimiento [idPedido=" + idPedido + ", codSeguimiento=" + codSeguimiento + ", docDestinatario="
				+ docDestinatario + ", estado=" + estado + ", fechaAct=" + fechaAct + "]";
	}

}
