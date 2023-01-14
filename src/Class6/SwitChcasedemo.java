package Class6;

public class SwitChcasedemo {
    public static void main(String[] args) {

        String country = "USA";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()) { // converts the text to lowercase USA=usa
            case "usa":
                System.out.println("burgers");
                break;
            case "itlay":
                System.out.println("pasta");
                break;
            case "afghanistan":
                System.out.println("kebab");
                break;
            default:
                System.out.println("worng country");


        }
    }
}
