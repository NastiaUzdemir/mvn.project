package ru.netology.mvn.project.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FreelanceServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freelance.csv")
    void calculateRestMonths(int expected, int income, int expenses, int threshold) {
        FreelanceService service = new FreelanceService();

        int result = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, result);
    }
}
