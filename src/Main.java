import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketprice;

        System.out.println("Введите стоимость билета");

        ticketprice = sc.nextInt();//Считываем цену билета

        int mile = ticketprice / 20;


        System.out.println("Количество бонусных миль:" + mile);


    }
}
