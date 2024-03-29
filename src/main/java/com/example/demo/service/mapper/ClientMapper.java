package com.example.demo.service.mapper;

import com.example.demo.dto.ArticleDto;
import com.example.demo.dto.ClientDto;
import com.example.demo.entity.Article;
import com.example.demo.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDto clientDto(Client client) {
        return new ClientDto(client.getId(),client.getNom(), client.getPrenom());
    }

}
