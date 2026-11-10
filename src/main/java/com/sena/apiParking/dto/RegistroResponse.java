package com.sena.apiParking.dto;      

import java.time.LocalDateTime;

import com.sena.apiParking.model.RegistroParqueo;
import com.sena.apiParking.model.TipoVehiculo;

public record RegistroResponse(Long idRegistro, String placa, TipoVehiculo tipoVehiculo, Integer numeroEspacio,
		LocalDateTime fechaEntrada, LocalDateTime fechaSalida, Double ValorPagado, CobroDetalle cobro) {

	public static RegistroResponse dde(RegistroParqueo r, CobroDetalle cobre) {
		return new RegistroResponse(r.getId_registro(), r.getVehiculo().getPlaca(), r.getVehiculo().getTipo(),
				r.getEspacio().getNumero(), r.getFechaEntrada(), r.getFechaSalida(), r.getValorPagado(), cobre);
	}

}
