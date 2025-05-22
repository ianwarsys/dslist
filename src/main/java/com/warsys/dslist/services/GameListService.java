package com.warsys.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warsys.dslist.dto.GameListDTO;
import com.warsys.dslist.entities.GameList;
import com.warsys.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> gameList = gameListRepository.findAll();
		return gameList.stream().map(entity -> new GameListDTO(entity)).toList();
	}

}
