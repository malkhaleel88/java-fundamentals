/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testing() {

        String check = App.linter("./app/src/test/resources/test.js");
        assertEquals("Line 9 : Missing semicolon.\nLine 11 : Missing semicolon.", check);

    }
}
