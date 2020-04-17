package ru.geekbrains.example.junit.hamcrest.object;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestTest {

    //Допустим, есть объект. В нашем случае экземпляр класса Dog. Проверим, что его метод toString() возвращает заданное значение:
    @Test
    public void givenDog_whenToString_thenReturnsSound() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasToString("gaf"));
    }

    //Проверим, что класс Dog явлется подтипом класса Animal. A класс Integer явлется подтипом класса Number:
    @Test
    public void givenSubclass_whenTypeCompatable_thenTrue() {
        assertThat(Dog.class, typeCompatibleWith(Animal.class));
        assertThat(Integer.class, typeCompatibleWith(Number.class));
    }

    //Убедимся, что данный объект является экземпляром класса Animal или его подкласса:
    @Test
    public void givenSubclass_whenChecked_thenTrue() {
        Dog dog = new Dog("gaf");
        assertThat(dog, instanceOf(Animal.class));
    }

    //Мы можем проверить, есть ли у bean-компонента свойство name , например:
    @Test
    public void givenBean__whenHasValue__thenCorrect() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasProperty("sound"));
    }

    //Мы также можем проверить, есть ли у Person свойство address , инициализированное в Нью-Йорке:
    @Test
    public void givenBean__whenHasCorrectValue__thenCorrect() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasProperty("sound", equalTo("gaf")));
    }

    //Мы также можем проверить, построены ли два объекта Person с одинаковыми значениями:
    @Test
    public void given2Beans__whenHavingSameValues__thenCorrect() {
        Dog dog1 = new Dog("gaf");
        Dog dog2 = new Dog("gaf");
        assertThat(dog1, samePropertyValuesAs(dog2));
    }
}