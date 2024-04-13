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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return new String()
                .format("<%s> <%s> <%s> <%s> <%d> <%s>\n",
                        firstName,
                        secondName,
                        middleName,
                        birthDate,
                        phoneNumber,
                        sex);
    }
}
