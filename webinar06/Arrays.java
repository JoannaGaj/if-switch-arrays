package webinar06;

public class Arrays {
    public static void main(String[] args) {
        int[] tab = new int[5];


        int[] tab2 = {2, 10, -1, 3};
//        System.out.println("Rozmiar tablicy = " + tab2.length);
//        for (int x: tab2
//        ) {
//            System.out.println(x);
//        }
        showTable(tab);
        showTable(tab2);
        tab2[3] =7;
        showTable(tab2);
    }
    public static void showTable(int[] tab) {
        System.out.println("Rozmiar tablicy = " + tab.length);
        for (int x: tab
        ) {
            System.out.println(x);
        }
    }
}
