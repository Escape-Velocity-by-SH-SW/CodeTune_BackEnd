package com.codetune.backend.feedback.domain.model;

import com.codetune.backend.problem.domain.model.Problem;

public record FeedbackContext(
        Problem problem,
        String submittedCode,
        String codeDiff
) {
}

