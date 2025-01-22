package com.aluracursos.Forohub.domain.topic.DTO;

import com.aluracursos.Forohub.domain.topic.CourseCategory;
import jakarta.validation.constraints.NotBlank;

public record CourseDataUpdate(
        @NotBlank
        Long id,
        String name,
        CourseCategory category
) {
}
