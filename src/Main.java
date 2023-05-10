import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int month;

        Scanner input= new Scanner(System.in);
        System.out.print("Nhap month : ");
        month = input.nextInt();

        switch(month){
            case 1:
                System.out.print("date = 31");
                break;
            case 3:
                System.out.print("date = 31");
                break;
            case 5:
                System.out.print("date = 31");
                break;
            case 7:
                System.out.print("date = 31");
                break;
            case 8:
                System.out.print("date = 31");
                break;
            case 10:
                System.out.print("date = 31");
                break;
            case 12:
                System.out.print("date = 31");
                break;
            case 2:
                System.out.print("date = 28 or date = 29");
                break;
            case 4:
                System.out.print("date = 30");
                break;
            case 6:
                System.out.print("date = 30");
                break;
            case 9:
                System.out.print("date = 30");
                break;
            case 11:
                System.out.print("date = 30");
                break;
            default:
                System.out.print("not month");
        }
    }
}