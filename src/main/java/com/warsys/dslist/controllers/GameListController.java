package com.warsys.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warsys.dslist.dto.GameListDTO;
import com.warsys.dslist.dto.GameMinDTO;
import com.warsys.dslist.services.GameListService;
import com.warsys.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	GameListService gameListService;	
	
	@Autowired
	GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByListId(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
		
	}

}
