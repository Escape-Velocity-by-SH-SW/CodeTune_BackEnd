package com.codetune.backend.feedback.domain.port;

import com.codetune.backend.feedback.domain.model.FeedbackContext;

public interface PromptBuilder {

    String build(FeedbackContext context);
}

