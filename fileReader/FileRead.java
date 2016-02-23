import java.io.*;

class FileRead {
  public static void main(String[] args) throws IOException, FileNotFoundException{
    String fileName = args[0];
    File file = new File(fileName);
    int size = (int) file.length();
    char[] content = new char[size];
    FileReader fr = new FileReader(file);
    fr.read(content,0,size);
    System.out.println(content);
    fr.close();
  }
}