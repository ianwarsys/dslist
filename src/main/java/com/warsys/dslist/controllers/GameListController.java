package com.warsys.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warsys.dslist.dto.GameListDTO;
import com.warsys.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	GameListService gameListService;	
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}
	

}
