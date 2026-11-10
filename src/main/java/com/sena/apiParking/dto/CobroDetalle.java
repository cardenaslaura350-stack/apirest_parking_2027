package com.sena.apiParking.dto;

public record CobroDetalle(Long idTarifa, long minutosTotales, long horasCompletas, long fraccionCobradas,
		long tarifaHora, long tarifaFracion, int tarifaMinutos, long valorTotal) {

}
