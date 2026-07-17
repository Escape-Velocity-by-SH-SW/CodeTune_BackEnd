package com.codetune.backend.problem.domain.model;

import java.util.List;

public record Problem(
        Long id,
        String title,
        String description,
        String language,
        String originalCode,
        List<String> reviewCriteria
) {
}

