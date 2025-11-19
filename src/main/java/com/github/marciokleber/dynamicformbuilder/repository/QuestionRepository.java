package com.github.marciokleber.dynamicformbuilder.repository;

import com.github.marciokleber.dynamicformbuilder.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuestionRepository extends JpaRepository<Question, UUID> {
}
