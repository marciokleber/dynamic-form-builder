package com.github.marciokleber.dynamicformbuilder.repository;

import com.github.marciokleber.dynamicformbuilder.domain.TypeQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TypeQuestionRepository extends JpaRepository<TypeQuestion, UUID> {
}
