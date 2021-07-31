import java.io.FileReader;
import java.io.IOException;

try(BufferedReader br = Files.newBufferedReader(Paths.get("surgeeffects.csv"))) {

    // CSV file delimiter
    String DELIMITER = ",";

    // read file line by line 
    String line;
    while ((line = br.readLine()) != null) {
        // convert line into columns
        String[] columns = line.split(DELIMITER);
        // print all columns
        System.out.println("Surge Effect: ["+ String.joint(", ", columns) +"]");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
//TODO csv datei importieren, werte daraus nehmen und für tides of chaos result benutzen, kann wert zwischen 1 und 100 sein. 