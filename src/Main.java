import java.util.Scanner;


//Ededin üstünü tapan bir  "power" metodu yazın, metod number ve
//power parametrleri alib ona uygun ededin ustunu geri qaytarmalidir.



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("eded daxil edin: ");
        int eded = scanner.nextInt();
        System.out.print("quvveti daxil edin: ");
        int quvvet = scanner.nextInt();
        System.out.println(ededinQuvveti(eded,quvvet));

    }

    public static int ededinQuvveti(int eded, int quvvet){
        int hasil =1;
        for (int i=1; i<=quvvet; i++){
            hasil *= eded;
        }
        return hasil;

    }
}
