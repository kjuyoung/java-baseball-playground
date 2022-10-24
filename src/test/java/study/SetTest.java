package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private static Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    // 요구사항 1
    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    // 요구사항 2
    @Test
    static Boolean contains_2(int num) {
        return numbers.contains(num);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains_ShouldReturnTrueForNotContain(int input) {
        assertTrue(SetTest.contains_2(input));
    }

    // 요구사항 3
    @Test
    static Boolean contains_3(int num) {
        return numbers.contains(num);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    void contains_ShouldGenerateTheExpectedNotContain(int input, Boolean expected) {
        Boolean actualValue = SetTest.contains_3(input);
        assertThat(actualValue).isEqualTo(expected);
    }
}
