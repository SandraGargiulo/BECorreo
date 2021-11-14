package com.unlaenvios.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unlaenvios.entities.Seguimiento;

@Repository("seguimientoRepository")
public interface ISeguimientoRepository extends JpaRepository<Seguimiento, Long>{
	
	//GET: envio(pedidos[idPedidos: string]) => Envios[{idPedido: string, idPedido: string, estado: string, fechaUltimaActualizacion: DateTime}]
	@Query("SELECT s.idPedido, s.codSeguimiento, s.docDestinatario, s.estado, s.fechaActual FROM Segumiento s WHERE s.idPedido like '(:idPedido)'")
	public Seguimiento findSeguimiento(@Param("idPedido") String idPedido);
	
	//POST: estado: string(En preparación → Despachado → En Camino → Entregado) por default En preparación, fechaUltimaActualizacion: DateTime
	@Query("UPDATE Segumiento s SET s.estado =(:estado), s.fechaActual=CURRENT_DATETIME() WHERE s.codSeguimiento=(:codSeguimiento)")
	public  Seguimiento changeEstado(@Param("codSeguimiento")String codSeguimiento);

	//PUT: envio(dniDestinatario: number, idPedido: string) => codSeguimiento: string
	/* Traigo el ultimo valor de la tabla seguimiento y le sumo 1, lo guardo en una variable auxiliar 
	 * inserto en la tabla seguimiento el idpedido que me da ventas, 
	 * la variable aux del nuevo registro codseguimiento, 
	 * el dni del cliente que me otorga ventas, 
	 * le defino el estado inicial "en preparacion" del pedido, 
	 * y traigo el registro de la fecha-hora que esta conf. de la base de datos formateada*/
	@Query("SET @numero=SELECT MAX(s.codSeguimiento) FROM Segumiento s;"
			+ "INSERT INTO Segumiento s (s.idPedido, s.codSeguimiento, s.docDestinatario, s.estado, s.fechaActual) "
			+ "VALUES ((:idPedido),@numero+1,(:docDestinatario),'EN_PREPARACION',FORMAT(current_time(),'yyyy-MM-dd HH:mm')")
	public  Seguimiento newSeguimiento(@Param("docDestinatario") int docDestinatario, @Param("idPedido") String idPedido);

}
