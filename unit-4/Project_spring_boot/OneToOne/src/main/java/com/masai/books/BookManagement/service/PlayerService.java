package com.masai.books.BookManagement.service;


import com.masai.books.BookManagement.dto.PlayerDto;
import com.masai.books.BookManagement.entity.Player;
import com.masai.books.BookManagement.repository.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    ModelMapper modelMapper;

    public PlayerDto findById(Long Id){

        Player player = playerRepository.findById(Id).get();

        PlayerDto playerDto = new PlayerDto();


        modelMapper.map(player, playerDto); // Src to Dest

        return playerDto;
    }
}
