package MyExeptions;

public class StringIsEmptyExeption extends Exception {
    public StringIsEmptyExeption(String field) {
        super("Значение " + field + " некорректное");
    }
}
