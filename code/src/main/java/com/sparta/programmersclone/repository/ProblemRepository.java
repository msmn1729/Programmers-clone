package com.sparta.programmersclone.repository;

import com.sparta.programmersclone.entity.Problem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findByProblemLevel(String problemLevel);
    List<Problem> findByProblemSource(String problemSource);
    Page<Problem> findByProblemLevel(String problemSource, Pageable pageable);
}
