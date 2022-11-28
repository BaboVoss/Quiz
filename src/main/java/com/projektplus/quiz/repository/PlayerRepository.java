package com.projektplus.quiz.repository;

import com.projektplus.quiz.database.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

}
