package restaurant2;

/**
 *
 * @author Iscariot
 */
import java.util.Scanner;

public class Restaurant2main {

    public static void main(String args[]) {
        String nama;
        String nomeja;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama :");
        nama = input.next();

        System.out.println("Masukan No Meja :");
        nomeja = input.next();

        TableService<Integer> p = new TableService<>(123454353);
        int y = p.getNik();
        System.out.println("Tipe yang digunakan Integer : " + y);

        System.out.println("");
        System.out.println("-----------");
        System.out.println("");

        TableService<String> p2 = new TableService<>("123455677");
        String z = p2.getNik();
        System.out.println("Tipe yang digunakan String : " + z);

        System.out.println("");
        System.out.println("##########################################");
        System.out.println("");

        /*
         CASE 2
         */
        TableService p3 = new TableService<>("213242422");
        String d = (String) p3.getNik();
        System.out.println("HARUS DICASTING : " + d);

    }

}