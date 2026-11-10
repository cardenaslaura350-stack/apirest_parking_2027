package com.sena.apiParking.dto;

import com.sena.apiParking.model.TipoVehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record EntradaRequet(@NotBlank String placa, @NotNull TipoVehiculo tipo, @Size(max=1000) String descripcion,
		@Positive Integer numeroEspacio) {

}
