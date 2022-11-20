import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person {
    private String instrument;



    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, int governmentsSalary, String instrument) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.instrument=instrument;
    }

    @Override
    public void favoriteSport() {
        System.out.println(" Football");

    }

    @Override
    public String favoriteLanguage() {
        return "Russian";
    }

    @Override
    public Month favoriteMouth() {
        return Month.SEPTEMBER;
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
        }else{
            return "wrong";
        }
    }



    @Override
    public long[] getPeopleOfAllAges(byte[]ages) {
        return new long[0];
    }
}
