import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream {
  private static boolean isExist;

  MyObjectOutputStream(String path) throws IOException {
    super(createFile(path));
  }

  private static FileOutputStream createFile(String path) throws IOException {
    if (new File(path).exists())
      isExist = true;
    return new FileOutputStream(path, true);
  }

  @Override
  protected void writeStreamHeader() throws IOException {
    if (!isExist)
      super.writeStreamHeader();
  }
}
