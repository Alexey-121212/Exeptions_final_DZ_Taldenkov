package MyExeptions;

public class DirectoryWithNameExists extends RuntimeException {
    public DirectoryWithNameExists() {
        super("Есть директория с таким именем, удалите ее");
    }
}
