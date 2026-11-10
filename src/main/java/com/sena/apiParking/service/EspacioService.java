package com.sena.apiParking.service;

import org.springframework.stereotype.Service;

import com.sena.apiParking.repository.EspacioParqueoRepository;
import com.sena.apiParking.repository.RegistroParqueoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EspacioService {
	
	private static final int MAX_LOTE= 500;
	
	private final EspacioParqueoRepository espacioRepo;
	private final RegistroParqueoRepository registroRepo;
	
	public EspacioParqueoReponse crear() {

}
