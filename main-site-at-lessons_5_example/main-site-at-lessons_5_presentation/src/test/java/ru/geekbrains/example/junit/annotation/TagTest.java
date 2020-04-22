package ru.geekbrains.example.junit.annotation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("regress")
class TagTest {

    @Tag("smoke")
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

}
//<build>
//    <plugins>
//        <plugin>
//            <artifactId>maven-surefire-plugin</artifactId>
//            <version>2.19</version>
//            <configuration>
//                <properties>
//                    <includeTags>acceptance</includeTags>
//                    <excludeTags>integration, regression</excludeTags>
//                </properties>
//            </configuration>
//            <dependencies>
//        </plugin>
//    </plugins>
//</build>