package ru.geekbrains.example.junit.hamcrest.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestTest {
//    Допустим, есть строка. Надо проверить, что она равна «petya», независимо от регистра (большие или маленькие буквы):
    @Test
    public void given2Strings_whenEqual_thenCorrect() {
        String a = "Petya";
        String b = "petya";
        assertThat(a, equalToIgnoringCase(b));
    }

//    А теперь допустим имеется строка, и надо проверить, что строка равна “Hi Petya”; При этом сравнивать надо без учета лишних пробелов, так что в начале и в конце строки пробелы удаляются, а в середине все подряд идущие пробелы сводятся к одному:
    @Test
    public void given2Strings_whenEqualIgnWS_thenCorrect() {
        String a = "  Hi   Petya ";
        assertThat(a, equalToCompressingWhiteSpace("Hi Petya"));
    }
}