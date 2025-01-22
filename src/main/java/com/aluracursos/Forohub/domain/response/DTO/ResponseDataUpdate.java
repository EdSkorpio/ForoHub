package com.aluracursos.Forohub.domain.response.DTO;

import com.aluracursos.Forohub.domain.topic.Topic;
import com.aluracursos.Forohub.domain.user.User;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record ResponseDataUpdate(
        @NotBlank
        Long id,
        String message,
        Topic topic,
        LocalDateTime creationDate,
        User author,
        String solution
) {
}
