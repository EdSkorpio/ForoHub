package com.aluracursos.Forohub.domain.topic.DTO;

import com.aluracursos.Forohub.domain.topic.CourseCategory;
import jakarta.validation.constraints.NotBlank;

public record CourseRegistrationData(
        @NotBlank(message = "The course name is required.")
        String name,

        @NotBlank(message = "The course category is required.")
        CourseCategory category
) {
}
