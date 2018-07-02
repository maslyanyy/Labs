import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Technique> goodList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\Кєк\\Програмування\\Java\\Lab7\\Maslo/list.csv"))) {

            goodList.forEach((Technique technique) -> {
                writer.println(technique.getHeaders());
                writer.println(technique.toCVS());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}