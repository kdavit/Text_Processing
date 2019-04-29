import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextProcessing {

    public List<String> txt_reader() {
        URI uri = new File("C:\\Users\\David\\Desktop\\java.txt").toURI();
        List<String> striqonebi = null;
        try {
            striqonebi = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return striqonebi;
    }

    public List<String> evens(List<String> striqonebi) {
        List<String> luwebi = new ArrayList<>();
        for (int i = 1; i < striqonebi.size(); i += 2) {
            luwebi.add(striqonebi.get(i));
        }
        return luwebi;
    }
}
