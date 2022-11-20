import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Programmer extends Person{
    private String computer;

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, int governmentsSalary,String computer) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.computer=computer;
    }


    @Override
    public void favoriteSport() {
        System.out.println(" Chess");

    }

    @Override
    public String favoriteLanguage() {
        return "English";
    }

    @Override
    public Month favoriteMouth() {
        return Month.OCTOBER;
    }

    @Override
    public String getLastName(String surname) {
        return surname;
    }

    @Override
    public LocalDate getDateOfBrith() {
        return null;
    }

    @Override
    public String getPhoneNumberAndEmail(String email) {
        if(email.contains("@")){
            return email;
        }else {
            return "wrong";
        }

    }

    @Override
    public long[] getPeopleOfAllAges(byte [] ages) {
        return new long[0];
    }
}
