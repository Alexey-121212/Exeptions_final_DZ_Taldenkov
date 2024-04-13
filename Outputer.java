import MyExeptions.DirectoryWithNameExists;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Outputer {
    public Outputer(HumanCard humanCard) {
        File file = new File(humanCard.getFirstName());
        if (file.exists() && !file.isDirectory()) {
            try (FileWriter writer = new FileWriter(humanCard.getFirstName(), true)) {
                writer.write(humanCard.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (file.exists() && file.isDirectory()) {
            throw new DirectoryWithNameExists();
        } else {
            try (FileWriter writer = new FileWriter(humanCard.getFirstName(), false)) {
                writer.write(humanCard.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
