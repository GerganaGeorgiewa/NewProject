import java.util.Scanner;

public class SeatsInStudyHall {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("length=");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("width=");
        double width = Double.parseDouble(scanner.nextLine());
        int cols = (int) (((width*100)-100)/70);
        int rows = (int) ((length*100)/120);
        int seats = (cols*rows) - 3;
        System.out.println(Math.floor(seats));
    }
}
