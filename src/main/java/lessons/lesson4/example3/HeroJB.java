package lessons.lesson4.example3;

public class HeroJB extends AccessModifiersExample{
    private String superHeroNAme;

    public HeroJB(String name, String companyName, String weaponType, String superHeroNAme) {
        super(name, companyName, weaponType);
        this.superHeroNAme = superHeroNAme;
    }
}
