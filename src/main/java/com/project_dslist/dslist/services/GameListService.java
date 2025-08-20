package com.project_dslist.dslist.services;

import com.project_dslist.dslist.dto.GameListDTO;
import com.project_dslist.dslist.entities.GameList;
import com.project_dslist.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        /*(var result) ou*/
        List<GameList> result = gameListRepository.findAll();
        // List<GameMinDTO> dto = ou
        return result.stream().map(x -> new GameListDTO(x)).toList();
        // da para fazer das duas formas, declarando uma variavel dto ou retornando direto o resultado
    }
}
