package com.codetune.backend.feedback.domain.port;

public interface CodeDiffGenerator {

    String generate(String originalCode, String submittedCode);
}

