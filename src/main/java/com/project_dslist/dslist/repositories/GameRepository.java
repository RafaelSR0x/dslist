package com.project_dslist.dslist.repositories;

import com.project_dslist.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
