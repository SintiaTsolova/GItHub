package homework.Person;

public class personMain {
    public static void main(String[] args) {
        personGetSet person = new personGetSet("Juan", "male", "Islam", "Bulgarian", "Mechanic", "Bulgarian", "0106236371", "Bulgaria");

        System.out.println("Name: " + person.getName());
        System.out.println("Sex: " + person.getSex());
        System.out.println("Religion: " + person.getReligion());
        System.out.println("Spoken language: " + person.getLanguageSpoken());
        System.out.println("Job: " + person.getJob());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("EGN: " + person.getEgn());
        System.out.println("Date of birth: " + person.getDateOfBirth());
        System.out.println("Age:" + person.getAge());
        System.out.println("Country of residence: " + person.getCountryOfResidence());
        System.out.println(person.getName() + " says "+ personMethod.sayHello(person.getName(), person.getLanguageSpoken()));
        System.out.println(person.getName() + " " + personMethod.celebrateEaster(person.getReligion()));
        System.out.println(personMethod.isAdult(person.getCountryOfResidence(), person.getAge()));
        System.out.println(person.getName() + " " + personMethod.canTakeLoan(person.getJob()));
    }
}
