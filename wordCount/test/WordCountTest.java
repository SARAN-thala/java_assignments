import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {
    String input = "hello world, How are you?";
    String specialChar = "!@@%^$%å ß≈Ω˜µ¬";
    String emptyInput = "";

    @Test
    public void should_return_number_of_words_in_a_string() {
        WordCount string = new WordCount(input);
        WordCount string1 = new WordCount(specialChar);
        WordCount string2 = new WordCount(emptyInput);
        assertEquals(5, string.countWord());
        assertEquals(2, string1.countWord());
        assertEquals(0, string2.countWord());
    }

    @Test
    public void should_return_number_of_lines_in_a_string() {
        WordCount string = new WordCount(input);
        WordCount string1 = new WordCount(specialChar);
        WordCount string2 = new WordCount(emptyInput);
        assertEquals(1, string.countLine());
        assertEquals(1, string1.countLine());
        assertEquals(0, string2.countLine());
    }

    @Test
    public void should_return_number_of_characters_in_a_string() {
        WordCount string = new WordCount(input);
        WordCount string1 = new WordCount(specialChar);
        WordCount string2 = new WordCount(emptyInput);
        assertEquals(25, string.countChar());
        assertEquals(15, string1.countChar());
        assertEquals(0, string2.countChar());
    }

    @Test
    public void should_return_number_of_bytes_in_a_string() {
        WordCount string = new WordCount(input);
        WordCount string1 = new WordCount(specialChar);
        WordCount string2 = new WordCount(emptyInput);
        assertEquals(25, string.countBytes());
        assertEquals(23, string1.countBytes());
        assertEquals(0, string2.countBytes());
    }
}