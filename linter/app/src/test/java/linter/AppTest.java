/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testEmpty() {
        Path path = Paths.get("./app/src/test/resources/empty.js");
        assertEquals("", App.linter(path.toString()));
    }
    @Test
    public void testNoError() {
        Path path = Paths.get("./app/src/test/resources/noErrors.js");
        assertEquals("", App.linter(path.toString()));
    }
    @Test
    public void testOneError() {
        Path path = Paths.get("./app/src/test/resources/oneError.js");
        assertEquals("Line 7 : Missing semicolon.\n", App.linter(path.toString()));
    }
    @Test
    public void testFewErrors() {
        Path path = Paths.get("./app/src/test/resources/fewErrors.js");
        assertEquals("Line 4 : Missing semicolon.\n" +
                "Line 9 : Missing semicolon.\n" +
                "Line 11 : Missing semicolon.\n", App.linter(path.toString()));
    }
    @Test
    public void testManyErrors() {
        Path path = Paths.get("./app/src/test/resources/manyErrors.js");
        assertEquals("Line 2 : Missing semicolon.\n" +
                "Line 8 : Missing semicolon.\n" +
                "Line 9 : Missing semicolon.\n" +
                "Line 10 : Missing semicolon.\n" +
                "Line 11 : Missing semicolon.\n" +
                "Line 12 : Missing semicolon.\n" +
                "Line 14 : Missing semicolon.\n" +
                "Line 15 : Missing semicolon.\n" +
                "Line 16 : Missing semicolon.\n" +
                "Line 17 : Missing semicolon.\n" +
                "Line 18 : Missing semicolon.\n", App.linter(path.toString()));
    }
}

