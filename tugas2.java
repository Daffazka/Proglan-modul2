import java.util.Scanner ; // import scanner untuk inputannya
import java.awt.*;
public class tugas2 {



    public static void main ( String [ ] args) {


        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        boolean loop1 = true;
        String nim;
        String syarat = "10370311";
        String syarate = "@webmail.umm.ac.id";
        try {
            while (loop == true){
                System.out.print("Masukkan NIM : ");
                String in = scan.nextLine();
                if (in.length() < 15 || in.length() > 15) {
                    System.out.println("NIM terlalu sedikit atau terlalu lebih!\n");
                } else {
                    if (in.contains(syarat)) {
                        loop = false;
                        System.out.println("Informatika\n");
                        while (loop1 == true) {
                            System.out.println("\n==DATA MAHASISWA==");
                            System.out.print("Masukkan Email : ");
                            String email = scan.nextLine();
                            if (email.contains(syarate)) {
                                loop1 = false;
                                System.out.print("Masukkan Nama : ");
                                String nama = scan.nextLine();
                                System.out.print("Masukkan No. HP : ");
                                String nohp = scan.nextLine();
                                if (nohp.length() < 11 || nohp.length() > 13) {
                                    System.out.println("No HP tidak sesuai kriteria!");
                                    loop1 = true;
                                }
                                else {
                                    System.out.println("\n\n==DATA MAHASISWA==");
                                    System.out.println("NIM : "+in);
                                    System.out.println("\nEmail : "+email);
                                    System.out.println("\nNama : "+nama);
                                    System.out.println("\nNo HP : "+nohp);
                                    System.out.println("Ingin mengakhiri program? (Y/N)");
                                    String pilih = scan.nextLine();
                                    if (pilih.compareToIgnoreCase("y") == 0) {
                                        throw new Exception();
                                    }
                                    else {
                                        loop = true;
                                    }
                                }
                            } else {
                                System.out.println("Email tidak sesuai!\n");
                                loop1 = true;
                            }
                        }
                    } else {
                        System.out.println("Bukan Informatika\n");
                        System.out.println("Ingin mengakhiri program? (Y/N)");
                        String pilih = scan.nextLine();
                        if (pilih.compareToIgnoreCase("y") == 0) {
                            throw new Exception();
                        }
                        else {
                            loop = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Program Berakhir!");
        }
    }
}
