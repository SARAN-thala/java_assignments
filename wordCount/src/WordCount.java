import java.nio.charset.Charset;

public class WordCount {
    private final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private final String text;

    public WordCount(String text) {
        this.text = text;
    }

    public int countWord() {
        if (this.text == null) return 0;
        return this.text.isEmpty() ? 0 : this.text.split("\\s+").length;
    }

    public int countLine() {
        if (this.text == null) return 0;
        return this.text.isEmpty() ? 0 : this.text.split("\\n").length;
    }

    public int countChar() {
        if (this.text == null) return 0;
        return this.text.isEmpty() ? 0 : this.text.split("").length;
    }

    public int countBytes() {
        if (this.text == null) return 0;
        final byte[] count = this.text.getBytes(UTF8_CHARSET);
        return count.length;
    }
}
