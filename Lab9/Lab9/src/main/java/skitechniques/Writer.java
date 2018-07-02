package skitechniques;

import chemicalsupplystore.goods.*;
import skitechniques.tecniques.Techniques;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Techniques> techniquesList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\NETBEANS\\Projects\\ChemicalStore/list.csv"))) {

            techniquesList.forEach((Techniques x) -> {
                writer.println(x.getHeaders());
                writer.println(x.toCVS());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}