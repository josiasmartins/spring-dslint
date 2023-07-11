package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// camada a acesso a dados (repository)
public interface GameRepository extends JpaRepository<Game, Long> {

}
