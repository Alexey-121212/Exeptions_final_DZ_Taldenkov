package MyExeptions;

public class PhoneFormatExeption extends Exception{
    public PhoneFormatExeption() {
        super("Значение номера телефона некорректное");
    }
}
