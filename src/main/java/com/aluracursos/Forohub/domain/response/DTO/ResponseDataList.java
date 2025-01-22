package com.aluracursos.Forohub.domain.response.DTO;

import com.aluracursos.Forohub.domain.response.Response;
import com.aluracursos.Forohub.domain.topic.Topic;
import com.aluracursos.Forohub.domain.user.User;

import java.time.LocalDateTime;

public record ResponseDataList(Long id, String message, Topic topic, LocalDateTime creationDate, User author, String solution) {
    public ResponseDataList(Response response){
        this(response.getId(), response.getMessage(), response.getTopic(), response.getCreationDate(), response.getAuthor(), response.getSolution());
    }
}
