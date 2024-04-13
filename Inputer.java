import MyExeptions.DataFormatExeption;
import MyExeptions.ParseSexTypeExeption;
import MyExeptions.PhoneFormatExeption;
import MyExeptions.StringIsEmptyExeption;

import java.util.Scanner;

public class Inputer {
    private final HumanCard humanCard;

    {
        humanCard = new HumanCard();
    }

    private Inputer(String firstName, String secondName, String middleName, String birthDate, int phoneNumber, Sex sex) {
        humanCard.setFirstName(firstName);
        humanCard.setSecondName(secondName);
        humanCard.setMiddleName(middleName);
        humanCard.setBirthDate(birthDate);
        humanCard.setPhoneNumber(phoneNumber);
        humanCard.setSex(sex);

    }

    public static Inputer create() {
        System.out.println("Введите данные, разделенные пробелом\nФамилия Имя Отчество дата_рождения номер_телефона пол :\n");
        Scanner readString = new Scanner(System.in);
        String inputedString = readString.nextLine();
        String[] inputedStringArray = inputedString.split(" ");
        boolean isCorrect = true;

        switch (checkParamNum(inputedStringArray)) {
            case more -> {
                System.out.println("Вы ввели больше 6 параметров");
                isCorrect = false;
            }
            case less -> {
                System.out.println("Вы ввели меньше 6 параметров");
                isCorrect = false;
            }
            case correct -> {
                try {
                    checkString("Фамилия", inputedStringArray[0]);
                } catch (StringIsEmptyExeption e) {
                    System.out.println(e.getMessage());
                    isCorrect = false;
                }

                try {
                    checkString("Имя", inputedStringArray[1]);
                } catch (StringIsEmptyExeption e) {
                    System.out.println(e.getMessage());
                    isCorrect = false;
                }

                try {
                    checkString("Отчество", inputedStringArray[2]);
                } catch (StringIsEmptyExeption e) {
                    System.out.println(e.getMessage());
                    isCorrect = false;
                }

                try {
                    checkDate(inputedStringArray[3]);
                } catch (DataFormatExeption e) {
                    System.out.println(e.getMessage());
                    isCorrect = false;
                }

                try {
                    checkPhoneNum(inputedStringArray[4]);
                } catch (PhoneFormatExeption e) {
                    System.out.println(e.getMessage());
                    isCorrect = false;
                }

                try {
                    checkSex(inputedStringArray[5]);
                } catch (ParseSexTypeExeption e) {
                    System.out.println(e.getMessage());
                    isCorrect = false;
                }
            }
        }
        if (isCorrect)
            return new Inputer(
                    inputedStringArray[0],
                    inputedStringArray[1],
                    inputedStringArray[2],
                    inputedStringArray[3],
                    Integer.parseInt(inputedStringArray[4]),
                    Sex.valueOf(inputedStringArray[5]));
        return null;

    }

    private static NumParamsErrorCodes checkParamNum(String[] strArr) {
        if (strArr.length == 6)
            return NumParamsErrorCodes.correct;
        if (strArr.length > 6)
            return NumParamsErrorCodes.more;
        return NumParamsErrorCodes.less;
    }

    private static void checkString(String name, String string) throws StringIsEmptyExeption {
        if (string == null || string.length() < 2) {
            throw new StringIsEmptyExeption(name);
        }
    }

    private static void checkDate(String string) throws DataFormatExeption {
        if (string == null || !(string.matches("\\d{2}.\\d{2}.\\d{4}"))) {
            throw new DataFormatExeption();
        }
    }

    private static void checkPhoneNum(String string) throws PhoneFormatExeption {
        if (string == null || !(string.matches("\\d+"))) {
            throw new PhoneFormatExeption();
        }
    }

    private static void checkSex(String string) throws ParseSexTypeExeption {
        if (string == null || !(string.matches("[fm]"))) {
            throw new ParseSexTypeExeption();
        }
    }

    public HumanCard getHumanCard() {
        return humanCard;
    }
}
