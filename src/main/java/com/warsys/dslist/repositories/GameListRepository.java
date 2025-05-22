package com.warsys.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warsys.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
