package com.aluracursos.Forohub.domain.topic.DTO;

import com.aluracursos.Forohub.domain.topic.CourseCategory;

public record CourseDataResponse(
        Long id,
        String name,
        CourseCategory category
) {
}
