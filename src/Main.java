import javax.print.Doc;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Person programmer1 =        new Programmer(11, "Osmon Imanbekov", (byte) 17, 'M', "osmonimanbekov.kslgmail.com", "0500040446", 5000, "Kyrgyzstan");
           Person programmer2 =    new Programmer(12, "Adil Aytbaev", (byte) 18, 'M', "osmonimanbekov.ksl@gmail.com", "0500040446", 5000, "Kyrgyzstan");
            Person programmer3 =    new Programmer(13, "Erbol Zholborsov", (byte) 17, 'M', "osmonimanbekov.ksl@gmail.com", "0500040446", 5000, "Kyrgyzstan");
        Person driver1 = new Driver(21, "Kutman Kadyrov", (byte) 36, 'M', "nurlan@gmail.com", "0778889900", 6000, "Kyrgyzstan");
          Person driver2 =   new Driver(22, "Nurzhigit Kadyrbekov", (byte) 39, 'M', "nurlangmail.com", "0778889900", 6000, "Kyrgyzstan");
             Person driver3 =  new Driver(23, "Almazbekov Atambaev", (byte) 65, 'M', "nurlan@gmail.com", "0778889900", 6000, "Kyrgyzstan");
        Person doctor1 = new Doctor(31, "Nurlan Nasip", (byte) 34, 'M', "nurlan@gmail.com", "0778889900", 6000, "Kyrgyzstan");
         Person doctor2 =new Doctor(32, "Nurlan Motuev", (byte) 43, 'M', "nurlan@gmail.com", "0778889900", 6000, "Kyrgyzstan");
             Person doctor3  = new Doctor(33, "Nurlan Nazarov", (byte) 29, 'M', "nurlan@gmail.com", "0778889900", 6000, "Kyrgyzstan");

       /* Person[] people={programmer1,programmer2,programmer3,driver1,driver2,driver3,doctor1,doctor2,doctor3};
        for (Person a:people) {
            System.out.println(a);
        }*/
        System.out.println("```````````````````````````````SURNAMES OF THE PEOPLE```````````````````````````````````");
        System.out.println("1-programmer surname : "+programmer1.getLastName(programmer1.getFullName()).substring(6));
        System.out.println("2-programmer surname : "+programmer2.getLastName(programmer2.getFullName()).substring(5));
        System.out.println("3-programmer surname : "+programmer3.getLastName(programmer3.getFullName()).substring(6));
        System.out.println("1-driver surname : "+driver1.getLastName(driver1.getFullName()).substring(6));
        System.out.println("2-driver surname : "+driver2.getLastName(driver2.getFullName()).substring(10));
        System.out.println("3-driver surname : "+driver3.getLastName(driver3.getFullName()).substring(11));
        System.out.println("1-doctor surname : "+doctor1.getLastName(doctor1.getFullName()).substring(7));
        System.out.println("2-doctor surname : "+doctor2.getLastName(doctor2.getFullName()).substring(7));
        System.out.println("3-doctor surname : "+doctor3.getLastName(doctor3.getFullName()).substring(7));
        System.out.println("````````````````````````````````Favorite sports`````````````````````````````````````");
        System.out.print(programmer1.getFullName()+" loves play ");programmer1.favoriteSport();
        System.out.print(programmer2.getFullName()+" loves play ");programmer1.favoriteSport();
        System.out.print(programmer3.getFullName()+" loves play ");programmer1.favoriteSport();
        System.out.print(driver1.getFullName()+" loves "); driver1.favoriteSport();
        System.out.print(driver2.getFullName()+" loves "); driver1.favoriteSport();
        System.out.print(driver3.getFullName()+" loves "); driver1.favoriteSport();
        System.out.print(doctor1.getFullName()+" plays ");doctor3.favoriteSport();
        System.out.print(doctor2.getFullName()+" plays ");doctor3.favoriteSport();
        System.out.print(doctor3.getFullName()+" plays ");doctor3.favoriteSport();
        System.out.println("``````````````````````````````Favorite language````````````````````````````````````````");
        System.out.print(programmer1.getFullName()+"'s favorite language is ");
        System.out.println(programmer1.favoriteLanguage());
        System.out.print(programmer2.getFullName()+"'s favorite language is "); programmer1.favoriteLanguage();
        System.out.println(programmer2.favoriteLanguage());
        System.out.print(programmer3.getFullName()+"'s favorite language is "); programmer1.favoriteLanguage();
        System.out.println(programmer3.favoriteLanguage());
        System.out.print(driver1.getFullName()+"'s favorite language is ");
        System.out.println(driver1.favoriteLanguage());
        System.out.print(driver2.getFullName()+"'s favorite language is ");
        System.out.println(driver2.favoriteLanguage());
        System.out.print(driver3.getFullName()+"'s favorite language is ");
        System.out.println(driver3.favoriteLanguage());
        System.out.print(doctor1.getFullName()+"'s favorite language is ");
        System.out.println(doctor1.favoriteLanguage());
        System.out.print(doctor2.getFullName()+"'s favorite language is ");
        System.out.println(doctor2.favoriteLanguage());
        System.out.print(doctor3.getFullName()+"'s favorite language is ");
        System.out.println(doctor3.favoriteLanguage());
        System.out.println("``````````````````````````````````Favorite month`````````````````````````````");
        System.out.print(programmer1.getFullName()+"'s favorite month is ");
        System.out.println(programmer1.favoriteMouth());
        System.out.print(programmer2.getFullName()+"'s favorite month is ");
        System.out.println(programmer2.favoriteMouth());
        System.out.print(programmer3.getFullName()+"'s favorite month is ");
        System.out.println(programmer3.favoriteMouth());
        System.out.print(driver1.getFullName()+"'s favorite month is ");
        System.out.println(driver1.favoriteMouth());
        System.out.print(driver2.getFullName()+"'s favorite month is ");
        System.out.println(driver2.favoriteMouth());
        System.out.print(driver3.getFullName()+"s favorite month is ");
        System.out.println(driver3.favoriteMouth());
        System.out.print(doctor1.getFullName()+"s favorite month is ");
        System.out.println(doctor1.favoriteMouth());
        System.out.print(doctor2.getFullName()+"s favorite month is ");
        System.out.println(doctor2.favoriteMouth());
        System.out.print(doctor3.getFullName()+"s favorite month is ");
        System.out.println(doctor3.favoriteMouth());
        System.out.println("`````````````````````````````````Date of birth````````````````````````");
        doctor3.getDateOfBrith();
        System.out.println(programmer1.getFullName()+"'s date of birth is "+(2022-programmer1.getAge()));
        System.out.println(programmer2.getFullName()+"'s date of birth is "+(2022-programmer2.getAge()));
        System.out.println(programmer3.getFullName()+"'s date of birth is "+(2022-programmer3.getAge()));
        System.out.println(driver1.getFullName()+"'s date of birth is "+(2022-driver1.getAge()));
        System.out.println(driver2.getFullName()+"'s date of birth is "+(2022-driver2.getAge()));
        System.out.println(driver3.getFullName()+"'s date of birth is "+(2022-driver3.getAge()));
        System.out.println(doctor1.getFullName()+"'s date of birth is "+(2022-doctor1.getAge()));
        System.out.println(doctor2.getFullName()+"'s date of birth is "+(2022-doctor2.getAge()));
        System.out.println(doctor3.getFullName()+"'s date of birth is "+(2022-doctor3.getAge()));
        System.out.println("`````````````````````````````Email address```````````````````````````");
        System.out.println(programmer1.getFullName()+"s email address is "+programmer1.getPhoneNumberAndEmail(programmer1.getEmail()));
        System.out.println(programmer2.getFullName()+"s email address is "+programmer2.getPhoneNumberAndEmail(programmer2.getEmail()));
        System.out.println(programmer3.getFullName()+"s email address is "+programmer3.getPhoneNumberAndEmail(programmer3.getEmail()));
        System.out.println(driver1.getFullName()+"s email address is "+driver1.getPhoneNumberAndEmail(driver1.getEmail()));
        System.out.println(driver2.getFullName()+"s email address is "+driver2.getPhoneNumberAndEmail(driver2.getEmail()));
        System.out.println(driver3.getFullName()+"s email address is "+driver3.getPhoneNumberAndEmail(driver3.getEmail()));
        System.out.println(doctor1.getFullName()+"s email address is "+doctor1.getPhoneNumberAndEmail(doctor1.getEmail()));
        System.out.println(doctor2.getFullName()+"'s email address is "+doctor2.getPhoneNumberAndEmail(doctor2.getEmail()));
        System.out.println(doctor3.getFullName()+"'s email address is"+doctor3.getPhoneNumberAndEmail(doctor3.getEmail()));
        System.out.println("`````````````````````````all ages of people`````````````````````````````````");

        byte[] ages={programmer1.getAge(), programmer2.getAge(),programmer3.getAge(), driver1.getAge(), driver2.getAge(), driver3.getAge(), doctor1.getAge(), doctor2.getAge(), driver3.getAge()};
        programmer1.getPeopleOfAllAges(ages);
        System.out.println(Arrays.toString(ages));











    }

        }




