package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    // 요구사항 1
    @Test
    void split_1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1","2");
    }

    @Test
    void split_2() {
        String[] actual = "1".split(",");
        assertThat(actual).contains("1");
    }

    // 요구사항 2
    @Test
    void substring() {
        String actual = "(1,2)".substring(1, "(1,2)".length()-1);
        assertThat(actual).isEqualTo("1,2");
    }

    // 요구사항 3
    @Test
    void charAt() {
        char actual = "abc".charAt(1);
        assertThat(actual).isEqualTo('b');
    }

    @Test
    void charAt_2() {
        assertThatThrownBy(() -> {
            char actual = "abc".charAt(5);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }

    @DisplayName("JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.")
    @Test
    void charAt_3() {
        assertThatThrownBy(() -> {
            char actual = "abc".charAt(10);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 10");
    }
}
