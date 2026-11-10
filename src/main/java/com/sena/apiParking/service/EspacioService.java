package com.sena.apiParking.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sena.apiParking.dto.EspacioRequest;
import com.sena.apiParking.dto.EspacioResponse;
import com.sena.apiParking.model.EspacioParqueo;
import com.sena.apiParking.repository.EspacioParqueoRepository;
import com.sena.apiParking.repository.RegistroParqueoRepository;
import com.sena.apiParking.exception.ApiException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EspacioService {

	private static final int MAX_LOTE = 500;

	private final EspacioParqueoRepository espacioRepo;
	private final RegistroParqueoRepository registroRepo;

	@Transactional
	public EspacioResponse crear(EspacioRequest req) {
		if (espacioRepo.existsByNumero(req.numero())) {
			throw ApiException.conflict("Ya existe el espacio numero " + req.numero());
		}
		EspacioParqueo e = EspacioParqueo.builder().numero(req.numero()).tipo(req.tipo()).build();
		return EspacioResponse.de(espacioRepo.save(e));
	}

}
