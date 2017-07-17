/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class MainScreen implements Serializable {

    public static void main(String args[]) {
        int nod, type, bookingno;
        char ch = 'y';
        double ff;
        String name;

        SmokingArea[] sa = new SmokingArea[3];
        NonSmokingArea[] nsa = new NonSmoingArea[8];
        Customer c[] = new Customer[20];
        Transportation t[][][] = new Transportation[20][5][5];
        Book b[] = new Book[20];

        int i = 0, j, k;

        for (i = 0; i < 3; i++) {
            sa[i] = new Luxury();
            sa[i].set(500, false, false);
        }
        for (i = 0; i < 8; i++) {
            nsa[i] = new Deluxe();
            nsa[i].set(1500, true, false);
        }

        for (i = 0; i < 20; i++) {
            c[i] = new Customer();
        }

        for (i = 0; i < 20; i++) {
            b[i] = new Book();
        }

        for (i = 0; i < 20; i++) {
            for (j = 0; j < 5; j++) {
                for (k = 0; k < 5; k++) {
                    t[i][j][k] = new Transportation();

                }
            }
        }

        String no;
        int ic = 0, isa = 0, insa = 0, itr1 = 0, itr2 = 0;

        int flag1 = 0, flag2 = 0, flag3 = 0;

        while (true) {

//	    int is=0,js=0,ks=0;
//	    int id=0,jd=0,kd=0;
            System.out.println("Apa yang anda pesan ?");
            System.out.println("Book a table(b)");
            System.out.println("Service lainnya(s)");
            System.out.println("Cancel a booked room(c)");
	    //System.out.println("Check Out(o)");
            //System.out.println("Display customer info based on booking number(r)");
            System.out.println("Exit Menu(e)");

            Scanner in = new Scanner(System.in);
            ch = in.next(".").charAt(0);

            if (ch == 'b') {

                for (i = 0; i < 3; i++) {
                    if (sa[i].getStatus() == false) {
                        isa = i;
                        flag1 = 1;
                        break;
                    } else {
                        flag1 = 0;
                    }
                }

                for (i = 0; i < 8; i++) {
                    if (nsa[i].getStatus() == false) {
                        insa = i;
                        flag2 = 1;
                        break;
                    } else {
                        flag2 = 0;
                    }
                }

                c[ic].setInitialDetails(ic);
                b[ic].BookNew(c[ic], sa[isa], nsa[insa], t, isa, flag1, flag2);
                c[ic].setBookingNo(b[ic].getBookingNumber());
                //System.out.println(ily);
                ic++;

            }

            if (ch == 'c') {
                ic--;
                Scanner in2 = new Scanner(System.in);
                System.out.println("Enter your booking no");
                no = in2.nextLine();

                int no1 = (int) no.charAt(0) - 48;
                int no2;

                System.out.println("Enter type(1-smoke,2-nonsmoke)");
                no2 = in2.nextInt();

                if (no2 == 1) {
                    sa[no1].statuschange();

                }
                if (no2 == 2) {
                    nsa[no1].statuschange();

                }

                System.out.println("Cancelled");

                //cancel in customer
            }

            int cno;

            if (ch == 's') {
                Scanner in2 = new Scanner(System.in);

                System.out.println("Enter your booking no");
                no = in2.nextLine();

                System.out.println("Enter your customer no");
                cno = in2.nextInt();

                System.out.println("Enter the service required(Transport(1)/Laundry(2))");

                int a = in2.nextInt();

                //itr1-> booking no
                itr1 = (int) (no.charAt(0)) - 48;

                //itr2-> for how many people
                if (no.charAt(1) == 's') {
                    itr2 = (int) (no.charAt(4)) - 48;
                } else {
                    itr2 = (int) (no.charAt(3)) - 48;
                }
		    //better use some other conversion from integer to string

                //System.out.println(no+" "+a+" "+itr1+" "+itr2);
                if (a == 1) {

                    t[itr1][itr2][0].setDetails();
                    b[cno].s1 = b[cno].s1 + (t[itr1][itr2][0].getTotalCost());
                    b[cno].BookDisplay(b[cno].ff, c[cno].name, b[cno].s1, b[cno].s2, no);
                }
                if (a == 2) {
                    l[itr1][itr2][1].setDetails();
                    b[cno].s2 = b[cno].s2 + l[itr1][itr2][1].getTotalCost();
                    b[cno].BookDisplay(b[cno].ff, c[cno].name, b[cno].s1, b[cno].s2, no);
                }
            }
            if (ch == 'e') {
                break;
            }
        }
    }

//	public void serializeBook(Book bc){
//	 
//		   try{
//	 
//			FileOutputStream fout = new FileOutputStream("e:\\address.ser");
//			ObjectOutputStream oos = new ObjectOutputStream(fout);   
//			oos.writeObject(bc);
//			oos.close();
//			System.out.println("Done");
//	 
//		   }catch(Exception ex){
//			   ex.printStackTrace();
//		   }
//	   }
}
