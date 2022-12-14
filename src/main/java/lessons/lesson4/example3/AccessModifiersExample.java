package lessons.lesson4.example3;

public class AccessModifiersExample {
    String name; // default (package private)

    private String personalCode;

    public String companyName;

    protected String weaponType;

    public AccessModifiersExample(String name, String companyName, String weaponType) {
        this.name = name;
        this.companyName = companyName;
        this.weaponType = weaponType;
    }


    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
