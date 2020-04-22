package ru.geekbrains.example.junit.hamcrest.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestTest {
    //    Имеется список. Необходимо убедиться, что он не пустой:
    @Test
    public void givenList_whenCheck_thenNotEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, is(not(empty())));

    }

    //    Имеется список. Необходимо убедиться, что его размер равен 3:
    @Test
    public void givenList_whenCheck_thenSize3() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));

    }

    //    Имеется список. Необходимо убедиться, что все его элементы больше 0:
    @Test
    public void givenList_whenCheck_thenPosotiveElements() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, everyItem(greaterThan(0)));
    }

    //    Имеется список. Необходимо убедиться, что он содержит элемент 5:
    @Test
    public void givenList_whenCheck_thenHasItem() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasItem(5));
    }

    //    Имеется список. Надо убедиться, что он состоит из элементов 5, 2, 4:
    @Test
    public void givenList_whenCheck_thenContainsElements() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, contains(5, 2, 4));
    }

    //    Имеется Map. Надо убедиться, что в нем есть ключ 1, значение a, а также запись (3, «с»):
    @Test
    public void givenMap_whenCheck_thenContains() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        assertThat(map, hasKey(1));
        assertThat(map, hasValue("a"));
        assertThat(map, hasEntry(3, "c"));
    }

//    Теперь перейдем к массивам.
//
//    Надо убедиться, что массив не пустой:

    @Test
    public void givenArray_whenCheck_thenNotEmpty() {
        String[] array = new String[]{"ab"};
        assertThat(array, not(emptyArray()));
    }
//    Надо убедиться, что размер массива равен 3:

    @Test
    public void givenArray_whenCheck_thenSize3() {
        Integer[] array = new Integer[]{5, 2, 4};
        assertThat(array, arrayWithSize(3));
    }
//    Убедиться, что массив содержит элементы 2, 4 и 5 в любом порядке:

    @Test
    public void givenArray_whenCheck_thenContainInAnyOrder() {
        Integer[] array = new Integer[]{5, 2, 4};
        assertThat(array, arrayContainingInAnyOrder(2, 5, 4));
    }
//    Убедиться, что в массиве есть элемент 5:

    @Test
    public void givenArray_whenCheck_thenHasItem() {
        Integer[] array = new Integer[]{5, 2, 4};
        assertThat(array, hasItemInArray(5));
    }
//    Убедиться, что массив состоит из элементов 5, 2, 4 в заданном порядке:

    @Test
    public void givenArray_whenCheck_thenContainsElements() {
        Integer[] array = new Integer[]{5, 2, 4};
        assertThat(array, arrayContaining(5, 2, 4));

    }
}