package com.project_dslist.dslist.controllers;

import com.project_dslist.dslist.dto.GameMinDTO;
import com.project_dslist.dslist.entities.Game;
import com.project_dslist.dslist.services.GameService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> fingAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
