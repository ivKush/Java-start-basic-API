package homeLesson2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class task2 {

    // Создать файл с названием file.txt. Если файл уже есть,
    // то создавать не надо. Записать в него Слово "TEXT" 100 раз

    public static void main(String[] args) throws IOException  {
        
        //  Path dir = Path.of("homeLesson", "task1"); // Создание папки (директории) 
        // Files.createDirectories(dir); // Создание папки (директории) 

        // // Path f = Path.of("file.txt"); // Создание файла
        // // Files.createFile(f); // Создание файла

        // Files.delete(dir); // Удаление папки (директории), удаляет посленюю папку, 
        //                     //так как метод Path будет ссылаться на последнюю папку.
        //                        // Так же можно попробовать удалить файл.

        // BufferedOutputStream buf = new BufferedOutputStream(new FileOutputStream("homeLesson2/file.txt")); // Запись в файл через накопление в буфере 
        // FileOutputStream f = new FileOutputStream("homeLesson2/file.txt");
        FileOutputStream f = new FileOutputStream("homeLesson2/file2.txt");
        
        
        String text = "TEXT\n";
        for (int i = 0; i < 100; i++) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            
            f.write(bytes);
        }
        f.close();
        
        // buf.write(bytes); // Запись в файл через накопление буфере
        
        // buf.close(); // Запись в файл через накопление в буфере
        // buf.flush(); // Запись в файл через накопление в буфере

    }
}
