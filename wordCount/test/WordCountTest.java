import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {
    String input = "hello world, How are you?";
    String specialChar = "!@@%^$%å ß≈Ω˜µ¬";
    String emptyInput = "";

    @Test
    public void should_return_number_of_words_in_a_string() {
        WordCount string = new WordCount(input);
        assertEquals(5, string.countWord(input));
        assertEquals(2, string.countWord(specialChar));
        assertEquals(0, string.countWord(emptyInput));
    }

    @Test
    public void should_return_number_of_lines_in_a_string() {
        WordCount string = new WordCount(input);
        assertEquals(1, string.countLine(input));
        assertEquals(1, string.countLine(specialChar));
        assertEquals(0, string.countLine(emptyInput));
    }

    @Test
    public void should_return_number_of_characters_in_a_string() {
        WordCount string = new WordCount(input);
        assertEquals(25, string.countChar(input));
        assertEquals(15, string.countChar(specialChar));
        assertEquals(0, string.countChar(emptyInput));
    }

    @Test
    public void should_return_number_of_bytes_in_a_string() {
        WordCount string = new WordCount(input);
        assertEquals(23, string.countBytes(specialChar));
        assertEquals(25, string.countBytes(input));
        assertEquals(0, string.countBytes(emptyInput));
    }
}