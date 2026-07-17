package com.codetune.backend.feedback.domain.port;

import com.codetune.backend.feedback.domain.model.FeedbackContext;
import com.codetune.backend.feedback.domain.model.FeedbackResult;

public interface AIProvider {

    FeedbackResult generateFeedback(FeedbackContext context);
}

