package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private static Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    // Test Case 구현
    // 요구사항 1
    @Test
    void checkLength() {
        int len = numbers.size();
        assertThat(len).isEqualTo(3);
    }

    // 요구사항 2
    @Test
    static Boolean contains_2(int num) {
        return numbers.contains(num);
    }

    @ParameterizedTest
    @ValueSource(ints = {10,20,30})
    void containsWithParameterizedTest(int num) {
        assertTrue(SetTest.contains_2(num));
    }

    // 요구사항 3
    @Test
    static Boolean contains_3(int input) {
        return numbers.contains(input);
    }

    @ParameterizedTest
    @CsvSource(value = {"10,true", "20,true", "30,true", "40,false", "50,false"})
    void contains_ShouldGenerateTheExpectedNoContain(int input, Boolean expected) {
        assertThat(SetTest.contains_3(input)).isEqualTo(expected);
    }
}
