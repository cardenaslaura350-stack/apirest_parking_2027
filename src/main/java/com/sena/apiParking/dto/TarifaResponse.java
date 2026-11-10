package com.sena.apiParking.dto;

import java.time.LocalDateTime;

import com.sena.apiParking.model.Tarifa;
import com.sena.apiParking.model.TipoVehiculo;

public record TarifaResponse(Long idTarifa, TipoVehiculo tipo, Long valorHora, Long valorFraccion,
		Integer fraccionMinutos, LocalDateTime vigenteDesde, LocalDateTime vigenteHasta, Boolean vigente) {
	public static TarifaResponse de(Tarifa t) {
		return new TarifaResponse(t.getId_tarifa(), t.getTipo(), t.getValorHora(), t.getValorFraccion(),
				t.getFraccionMinutos(), t.getVigenteDesde(), t.getVigenteHasta(), t.getVigenteHasta() == null);
	}
}
