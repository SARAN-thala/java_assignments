import java.io.*;

class FileReadPractice {
  public static void main(String[] args)  throws IOException{
    File file = new File("foo.txt");
    file.createNewFile();
    FileWriter fw = new FileWriter(file);
    fw.write("Hello World!\n How are you?\n I'm good !!!");
    fw.flush();
    fw.close();

    FileReader fr = new FileReader(file);
    char[] content = new char[100];
    // for (char c: content) {
    //   System.out.print(c);
    // };
    fr.read(content,0,100);
    System.out.println(content);
    fr.close();
  }
}