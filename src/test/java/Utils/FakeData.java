package Utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class FakeData {

    public static String generateSegment(){
        Faker faker=new Faker();
       String name= faker.name().title();
       return name;
    }
    public static String generatePreferedStore(){
        Faker faker=new Faker();
       String load= faker.number().digits(3);
        return load;
    }
    public static String generateCustomerId(){
        Faker faker=new Faker();

        String pin= faker.number().digits(6);
        return pin;
    }
    public static String generateEmail(){
        Faker faker=new Faker();
        String email= faker.internet().emailAddress();
        return email;
    }
    public static String generatePersonalMessage() {
        Faker faker = new Faker();

        String permessage = faker.lorem().sentence(7);
        return permessage;
    }
        public static String generateorderNumber(){
            Faker faker=new Faker();

            Integer ordernum=  faker.number().numberBetween(1000000000,1899999999);
            String order=ordernum.toString();
            return order;
    }
    public static String generateOperatorID() {
        Faker faker = new Faker();

        String operatorID = faker.numerify("###MJF");
        return operatorID;
    }
    public static String generatePurchaserID(){

        Random random = new Random();
        int number = random.nextInt(999999999);

        return String.format("%09d", number);
    }


}
