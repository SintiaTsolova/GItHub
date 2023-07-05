package homework.Person;

public class personMethod {

    public static String sayHello(String firstName, String language) {
        switch (language.toLowerCase()) {
            case "bulgarian":
                language = "Здравей";
                break;
            case "italian":
                language = "Hola";
                break;
            default:
                language = "Hello";
        }
        return language;
    }


    public static String celebrateEaster(String religion) {
        switch (religion.toLowerCase()) {
            case "catholic", "orthodox":
                religion = "celebrates Easter";
                break;
            case "islam":
                religion = "doesn't celebrate Easter";
                break;
        }
        return religion;
    }

    public static String isAdult(String country, int age) {
        String result;

        switch (country) {
            case "Bulgaria":
            case "Italy":
                if (age >= 18) {
                    result = "The person is adult";
                } else {
                    result = "The person is not adult";
                }
                break;
            case "USA":
                if (age >= 21) {
                    result = "The person is adult";
                } else {
                    result = "The person is not adult";
                }
                break;
            default:
                result = "Country not supported";
        }
        return result;
    }

    public static String canTakeLoan(String job) {
        String loan = "";
        switch (job) {
            case "Actor", "Mechanic" -> loan = "can take loan";
            case "Instructor" -> loan = "can't take loan";
        }
        return loan;
    }
}
