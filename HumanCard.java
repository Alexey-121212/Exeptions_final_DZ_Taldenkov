public class HumanCard {
    private String firstName;
    private String secondName;
    private String middleName;
    private String birthDate;
    private int phoneNumber;
    private Sex sex;

    public HumanCard() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        String str = new String();
        String.format(str, "<%s> <%s> <%s> <%s> <%d> <%s>\n",
                firstName,
                secondName,
                middleName,
                birthDate,
                phoneNumber,
                sex);
        return str;
//        return new String()
//                .format("<%s> <%s> <%s> <%s> <%d> <%s>\n",
//                        firstName,
//                        secondName,
//                        middleName,
//                        birthDate,
//                        phoneNumber,
//                        sex);
    }
}
