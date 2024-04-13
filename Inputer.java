import MyExeptions.DataFormatExeption;
import MyExeptions.ParseSexTypeExeption;
import MyExeptions.PhoneFormatExeption;
import MyExeptions.StringIsEmptyExeption;

import java.util.Scanner;

public class Inputer {
    private Scanner readString;
    private String inputedString;
    private String[] inputedStringArray;

    {
        readString = new Scanner(System.in);
    }

    public Inputer(HumanCard humanCard) {

        System.out.println("Введите данные, разделенные пробелом\nФамилия Имя Отчество дата_рождения номер_телефона пол :\n");
        inputedString = readString.nextLine();
        inputedStringArray = inputedString.split(" ");

        switch (checkParamNum(inputedStringArray)) {
            case more -> {
                System.out.println("Вы ввели больше 6 параметров");
            }
            case less -> {
                System.out.println("Вы ввели меньше 6 параметров");
            }
            case correct -> {
                try {
                    if (checkString("Фамилия", inputedStringArray[0])) humanCard.setFirstName(inputedStringArray[0]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    if (checkString("Имя", inputedStringArray[1])) humanCard.setFirstName(inputedStringArray[0]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    if (checkString("Отчество", inputedStringArray[2])) humanCard.setFirstName(inputedStringArray[0]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    if (checkDate(inputedStringArray[3])) humanCard.setBirthDate(inputedStringArray[3]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    if (checkPhoneNum(inputedStringArray[4]))
                        humanCard.setPhoneNumber(Integer.parseInt(inputedStringArray[4]));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    if (checkSex(inputedStringArray[5]))
                        humanCard.setSex(Sex.valueOf(inputedStringArray[5]));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private NumParamsErrorCodes checkParamNum(String[] strArr) {
        if (strArr.length == 6)
            return NumParamsErrorCodes.correct;
        if (strArr.length > 6)
            return NumParamsErrorCodes.more;
        return NumParamsErrorCodes.less;
    }

    private boolean checkString(String name, String string) throws Exception {
        if (string == null || string.length() < 2) {
            throw new StringIsEmptyExeption(name);
        }
        return true;
    }

    private boolean checkDate(String string) throws Exception {
        if (string == null || !(string.matches("\\d{2}.\\d{2}.\\d{4}"))) {
            throw new DataFormatExeption();
        }
        return true;
    }

    private boolean checkPhoneNum(String string) throws PhoneFormatExeption {
        if (string == null || !(string.matches("\\d+"))) {
            throw new PhoneFormatExeption();
        }
        return true;
    }


    private boolean checkSex(String string) throws ParseSexTypeExeption {
        if (string == null || !(string.matches("[fm]"))) {
            throw new ParseSexTypeExeption();
        }
        return true;
    }
}