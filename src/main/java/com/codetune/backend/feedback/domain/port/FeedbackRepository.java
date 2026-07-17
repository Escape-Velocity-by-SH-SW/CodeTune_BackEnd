package com.codetune.backend.feedback.domain.port;

import com.codetune.backend.feedback.domain.model.FeedbackResult;

public interface FeedbackRepository {

    void save(Long problemId, String submittedCode, String codeDiff, FeedbackResult result);
}

