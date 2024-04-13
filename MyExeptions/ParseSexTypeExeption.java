package MyExeptions;

public class ParseSexTypeExeption extends Exception{
    public ParseSexTypeExeption() {
        super("Значение типа Sex некорректное");
    }
}
