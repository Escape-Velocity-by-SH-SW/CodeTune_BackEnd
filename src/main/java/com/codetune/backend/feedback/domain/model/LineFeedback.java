package com.codetune.backend.feedback.domain.model;

public record LineFeedback(
        int startLine,
        int endLine,
        String category,
        String message
) {
}

