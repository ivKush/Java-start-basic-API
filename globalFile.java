import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class globalFile {
    public static void main(String[] args) throws IOException {
        
        // BufferedOutputStream buf = new BufferedOutputStream(new FileOutputStream("homeLesson2/file.txt")); // Запись в файл через накопление в буфере 
        // FileOutputStream f = new FileOutputStream("homeLesson2/file.txt");
        FileOutputStream f = new FileOutputStream("homeLesson2/file2.txt");
        
        
        String text = "TEXT\n";
        for (int i = 0; i < 100; i++) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            
            f.write(bytes);
        }
        f.close();
    }
}
