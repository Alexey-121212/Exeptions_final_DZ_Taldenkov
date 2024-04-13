package MyExeptions;

import java.io.IOException;

public class DirectoryWithNameExists extends RuntimeException {
    public DirectoryWithNameExists() {
        super("Есть директория с таким именем, удалите ее");
    }
}
