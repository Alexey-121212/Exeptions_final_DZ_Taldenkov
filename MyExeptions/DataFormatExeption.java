package MyExeptions;

public class DataFormatExeption extends Exception {
    public DataFormatExeption() {
    super("Значение даты рождения некорректное");
    }
}
