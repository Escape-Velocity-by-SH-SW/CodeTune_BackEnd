package com.codetune.backend.feedback.application;

import com.codetune.backend.feedback.domain.model.FeedbackResult;

public interface RequestFeedbackUseCase {

    FeedbackResult requestFeedback(Long problemId, String submittedCode);
}

