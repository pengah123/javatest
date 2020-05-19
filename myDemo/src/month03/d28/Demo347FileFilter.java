package month03.d28;

import java.io.File;
import java.io.FileFilter;

public class Demo347FileFilter {
    public static void main(String[] args) {
        File file = new File("C:\\abc");
        getAllFiles(file);
    }

    public static void getAllFiles(File file) {
        System.out.println(file);
        File[] files = file.listFiles(f ->{
            return f.isDirectory() || f.getName().toString().toLowerCase().endsWith(".java");
        }
           );
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFiles(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
