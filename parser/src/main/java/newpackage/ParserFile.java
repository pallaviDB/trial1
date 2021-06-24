package newpackage;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserFile {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {

            URL res = ParserFile.class.getClassLoader().getResource("gitlog.txt");
            File file = Paths.get(res.toURI()).toFile();
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                System.out.println(sc.nextLine());
            }

    }

}

