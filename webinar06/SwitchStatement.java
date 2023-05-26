package webinar06;

public class SwitchStatement {
    public static void main(String[] args) {
        String dayOfWeek = "Poniedziałek";
        System.out.println("Co sądzisz o danym dniu tygodnia - " + dayOfWeek + "?");

        switch(dayOfWeek) {
            case "Poniedziałek":
                System.out.println("Nie lubie poniedziałków");
                break;
            case "Wtorek":
                System.out.println("Na szczęście już wtorek");
                break;
            case "Środa":
                System.out.println("Coraz bliżej weekend");
                break;
            default:
                System.out.println("Nie znam takiego dnia tygodnia");

        }
    }
}
