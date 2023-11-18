package com.conecta.conectagraxa.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conecta.conectagraxa.model.Feed_Empresa;
import com.conecta.conectagraxa.model.dto.Feed_EmpresaDTO;
import com.conecta.conectagraxa.repositories.Feed_EmpresaRepository;
import com.conecta.conectagraxa.service.Feed_EmpresaService;

@RestController
@RequestMapping(value = "/feed-empresa")
public class Feed_EmpresaController {

	@Autowired
	private Feed_EmpresaService service;

	@Autowired
	private Feed_EmpresaRepository feedRepository;

	// Listar feeds
	@GetMapping(value = "/feeds")
	ResponseEntity<List<Feed_EmpresaDTO>> findAll() {
		List<Feed_Empresa> list = service.getAllProfissional();
		List<Feed_EmpresaDTO> listDTO = list.stream().map(obj -> new Feed_EmpresaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	//EDITAR FEED - SOBRE
}