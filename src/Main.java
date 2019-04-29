import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextProcessing test = new TextProcessing();
        List<String> stringList = test.txt_reader();
        List<String> luwebi = test.evens(stringList);

        for (String i : luwebi) {
            System.out.println(i);
        }
    }
}
