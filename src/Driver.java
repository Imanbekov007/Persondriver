import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person  {
    private String car;




    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, int governmentsSalary, String car) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.car=car;
    }
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }


    @Override
    public void favoriteSport() {
        System.out.println(" Racing");
    }

    @Override
    public String favoriteLanguage() {
        return "French";
    }

    @Override
    public Month favoriteMouth() {
        return Month.JUNE;
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
