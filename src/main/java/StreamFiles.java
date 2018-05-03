import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created by Rogoza Dimity on 03.05.2018.
 */
public class StreamFiles {
    public static void main(String[] args) {
        changeName();
    }
    public static void changeName(){
        File filePath = new File(".\\path");
        List<File> files = asList(filePath.listFiles());
        files.stream()
                .filter(s -> s.getName().startsWith("f"))
                .forEach(s -> s.renameTo(new File(".\\path\\" +
                        s.getName().replace(".txt","") + "L" + ".txt")));
    }
}
