package com.codetune.backend.feedback.domain.port;

import com.codetune.backend.feedback.domain.model.FeedbackResult;

public interface FeedbackValidator {

    FeedbackResult validate(FeedbackResult result, String submittedCode);
}

