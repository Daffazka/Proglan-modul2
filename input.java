import java.util.Scanner;

public class Input {

    interface cek {
        String cekName(String  name);

        void cekFrom(String from);

        int cekDate(int date);

        void list();
    }

    static String[] book = new String[100];
    static String[] place = new String[10];
    static String[] tahun = new String[10];
    static String[] nama = new String[10];


    static class tes implements cek {
        boolean stop = true;

        public int cekDate(int date) {
            if (date < 2018 || date > 2022) {
                System.out.println("Tahun buku yang dimasukan harus antara dari 2018-2022");
                stop=false;
            }
            return date;
        }

        public void cekFrom(String from) {
            for (int i = 0; place[i] != null; i++) {
                if (from.equals(place[i])) {
                }
            }
        }

        public String cekName(String name) {
            for (int i = 0; nama[i] != null; i++) {
                if (name.equals(nama[i])) {
                    System.err.println("Buku Telah Diinputkan");
                    stop=false;
                }
            }
            return name;
        }

        public void list() {
            for(int i=0; nama[i] != null; i++) {
                System.out.println("=========================================");
                System.out.println("Judul Buku  = " + nama[i]);
                System.out.println("Tempat Buku = " + place[i]);
                System.out.println("Tahun Buku  = " + tahun[i]);
                System.out.println();

            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int asd = 0;
        String inName;
        String inFrom;
        int inDate;
//        int inIdex;
        tes AZ = new tes();
        boolean lanjut = true;
        while (lanjut) {
            AZ.stop=true;
            System.out.println("===================================");
            System.out.println("Welcome to Library");
            System.out.print("NAMA : ");
            inName = input.next();
            AZ.cekName(inName);
            input.nextLine();
            if(AZ.stop==false){
                continue;
            }
            System.out.print("From : ");
            inFrom = input.nextLine();
            AZ.cekFrom(inFrom);
            System.out.print("Date : ");
            inDate = input.nextInt();
            AZ.cekDate(inDate);
            if(AZ.stop==false){
                continue;
            }

            System.out.println("===================================");
            place[asd] = String.valueOf(inFrom);
            nama[asd] = String.valueOf(inName);
            tahun[asd] = String.valueOf(inDate);
            System.out.println("===================================");
            System.out.println(inName);
            System.out.println(inFrom);
            System.out.println(inDate);
            System.out.println("Buku Berhasil ditambahkan");
            AZ.list();
        }
    }
}

try {
        System.out.print("Masukkan Nim Kamu : ");
        Nim = input.nextLine();
        String subNim = Nim.substring(4,12);

        if(!subNim.equals("10370311")){
        throw new Exception("Salah input NIM tidak sama");
        }

        if(Nim.length() != 15){
        throw new Exception("Salah input NIM nim kurang/lebih");
        } else{
        ulang = false;
        System.out.println("NIM Anda telah ter input");
        }

        } catch (Exception e) {
        System.out.println(e);
        }