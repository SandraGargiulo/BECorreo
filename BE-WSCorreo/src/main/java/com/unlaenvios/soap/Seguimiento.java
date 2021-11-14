//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.11 a las 10:02:02 AM ART 
//


package com.unlaenvios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seguimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="seguimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seguimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docdestinatario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguimiento", propOrder = {
    "pedido",
    "seguimiento",
    "docdestinatario",
    "estado",
    "fechaActual"
})
public class Seguimiento {

    @XmlElement(required = true)
    protected String pedido;
    @XmlElement(required = true)
    protected String seguimiento;
    protected int docdestinatario;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String fechaActual;

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedido(String value) {
        this.pedido = value;
    }

    /**
     * Obtiene el valor de la propiedad seguimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeguimiento() {
        return seguimiento;
    }

    /**
     * Define el valor de la propiedad seguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeguimiento(String value) {
        this.seguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad docdestinatario.
     * 
     */
    public int getDocdestinatario() {
        return docdestinatario;
    }

    /**
     * Define el valor de la propiedad docdestinatario.
     * 
     */
    public void setDocdestinatario(int value) {
        this.docdestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActual() {
        return fechaActual;
    }

    /**
     * Define el valor de la propiedad fechaActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActual(String value) {
        this.fechaActual = value;
    }

}
