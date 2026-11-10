package com.sena.apiParking.dto;

import com.sena.apiParking.model.EspacioParqueo;
import com.sena.apiParking.model.EstadoEspacio;
import com.sena.apiParking.model.TipoVehiculo;

public record EspacioResponse(Long idEspacio, Integer numero, TipoVehiculo tipo, EstadoEspacio estado) {
	
	public static EspacioResponse de(EspacioParqueo e) {
		return new EspacioResponse(e.getId_espacio(),e.getNumero(), e.getTipo(),e.getEstado());
	}

}
