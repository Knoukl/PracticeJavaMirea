package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryUtils {

    public static List<String> getDirectoryContents(String path) {
        File directory = new File(path);
        List<String> result = new ArrayList<>();

        if (!directory.exists() & !directory.isDirectory()) {
            return result;
        }

        String[] files = directory.list();
        if (files != null) {
            for (String file : files) {
                result.add(file);
            }
        }

        System.out.println("Первые 5 элементов каталога:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + result.get(i));
        }
        return result;
    }
}