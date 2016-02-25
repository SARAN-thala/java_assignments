import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WC {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        File file = new File(fileName);
        int size = (int) file.length();
        char[] content = new char[size];
        FileReader fr = new FileReader(file);
        fr.read(content);
        String data = new String(content);

        WordCount wc = new WordCount(data);
        int lines = wc.countLine();
        int words = wc.countWord();
        int chars = wc.countChar();
        int bytes = wc.countBytes();


        System.out.println("No of Lines: "+ lines);
        System.out.println("No of words: "+ words);
        System.out.println("No of chars: "+ chars);
        System.out.println("No of bytes: "+ bytes);
    }
}
