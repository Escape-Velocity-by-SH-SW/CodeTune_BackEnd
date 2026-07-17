package com.codetune.backend.feedback.domain.model;

import java.util.List;

public record FeedbackResult(
        String summary,
        List<LineFeedback> goodChanges,
        List<LineFeedback> remainingProblems,
        String nextHint,
        boolean runtimeVerified
) {
}

