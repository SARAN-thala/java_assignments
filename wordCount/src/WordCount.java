import java.nio.charset.Charset;

public class WordCount {
    private final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private final String text;

    public WordCount(String text) {
        this.text = text;
    }

    public int countWord(String word) {
        if (word == null) return 0;
        return word.isEmpty() ? 0 : word.split("\\s+").length;
    }

    public int countLine(String word) {
        if (word == null) return 0;
        return word.isEmpty() ? 0 : "\\n".split(word).length;
    }

    public int countChar(String word) {
        if (word == null) return 0;
        return word.isEmpty() ? 0 : word.split("").length;
    }

    public int countBytes(String word) {
        if (word == null) return 0;
        final byte[] count = word.getBytes(UTF8_CHARSET);
        return count.length;
    }
}
