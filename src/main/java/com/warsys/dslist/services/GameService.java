package com.warsys.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warsys.dslist.dto.GameMinDTO;
import com.warsys.dslist.entities.Game;
import com.warsys.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(game -> new GameMinDTO(game)).toList();
	}

}
