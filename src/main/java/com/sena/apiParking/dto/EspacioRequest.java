package com.sena.apiParking.dto;

import com.sena.apiParking.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EspacioRequest(@NotNull @Positive Integer numero, @NotNull TipoVehiculo tipo) {

}
