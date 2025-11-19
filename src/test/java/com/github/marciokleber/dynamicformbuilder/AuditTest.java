package com.github.marciokleber.dynamicformbuilder;

import com.github.marciokleber.dynamicformbuilder.domain.Form;
import com.github.marciokleber.dynamicformbuilder.domain.Question;
import com.github.marciokleber.dynamicformbuilder.domain.TypeQuestion;
import com.github.marciokleber.dynamicformbuilder.repository.FormRepository;
import com.github.marciokleber.dynamicformbuilder.repository.QuestionRepository;
import com.github.marciokleber.dynamicformbuilder.repository.TypeQuestionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuditTest {

    private final FormRepository formRepository;
    private final QuestionRepository questionRepository;
    private final TypeQuestionRepository typeQuestionRepository;


    @Autowired
    public AuditTest(FormRepository formRepository,
                     QuestionRepository questionRepository,
                     TypeQuestionRepository typeQuestionRepository) {
        this.formRepository = formRepository;
        this.questionRepository = questionRepository;
        this.typeQuestionRepository = typeQuestionRepository;
    }

    @Test
    public void verifyAuditForm(){
        Form f = new Form();
        f.setDescription("description");
        var form = formRepository.save(f);
        Assertions.assertAll("Audit Form Test",
                () -> Assertions.assertNotNull(form.getCreatedAt()),
                () -> Assertions.assertNotNull(form.getUpdatedAt())
        );
    }

    @Test
    public void verifyAuditQuestion(){
        Question q = new Question();
        q.setDescription("description");
        var question = questionRepository.save(q);
        Assertions.assertAll("Audit Question test",
            () -> Assertions.assertNotNull(question.getCreatedAt()),
            () -> Assertions.assertNotNull(question.getUpdatedAt())
        );
    }

    @Test
    public void verifyAuditTypeQuestion(){
        TypeQuestion tq = new TypeQuestion();
        tq.setDescription("description");
        var typeQuestion = typeQuestionRepository.save(tq);
        Assertions.assertAll("Audit TypeQuestion Test",
                () -> Assertions.assertNotNull(typeQuestion.getCreatedAt()),
                () -> Assertions.assertNotNull(typeQuestion.getUpdatedAt())
        );
    }
}
