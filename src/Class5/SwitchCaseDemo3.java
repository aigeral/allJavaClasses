package Class5;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {

        String day = "Tuesday";
        switch (day) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            default:
                System.out.println("Wrong day");
        }
    }
}