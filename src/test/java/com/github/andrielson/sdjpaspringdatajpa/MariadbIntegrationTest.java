package com.github.andrielson.sdjpaspringdatajpa;

import com.github.andrielson.sdjpaspringdatajpa.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MariadbIntegrationTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    void testMariadb() {
        long countBefore = bookRepository.count();
        assertThat(countBefore).isGreaterThan(0);
    }
}
