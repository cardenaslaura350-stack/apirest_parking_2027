package com.sena.apiParking.dto;

import com.sena.apiParking.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EspacioLoteRequest(@NotNull @Positive Integer desde, @NotNull @Positive Integer hasta,
		@NotNull TipoVehiculo tipo) {

}
