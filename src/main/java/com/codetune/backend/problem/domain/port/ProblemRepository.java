package com.codetune.backend.problem.domain.port;

import com.codetune.backend.problem.domain.model.Problem;

import java.util.Optional;

public interface ProblemRepository {

    Optional<Problem> findById(Long problemId);
}

