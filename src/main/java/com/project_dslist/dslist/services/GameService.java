package com.project_dslist.dslist.services;

import com.project_dslist.dslist.dto.GameMinDTO;
import com.project_dslist.dslist.entities.Game;
import com.project_dslist.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        /*(var result) ou*/
        List<Game> result = gameRepository.findAll();
        // List<GameMinDTO> dto = ou
        return result.stream().map(x -> new GameMinDTO(x)).toList();
        // da para fazer das duas formas, declarando uma variavel dto ou retornando direto o resultado
    }
}
