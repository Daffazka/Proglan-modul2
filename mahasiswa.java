import java.util.Scanner;

public class mahasiswa {

    Scanner input = new Scanner(System.in);

    private String kodenim = "10370311";
    private String kodeemail = "@webmail.umm.ac.id";
    private String email;
    private String nama;
    private String noTelp;
    private String nim;
    boolean cek = true;
    //tipe data//
    public String getkodenim() {
        return this.kodenim;
    }
    public String getkodeemail() {
        return this.kodeemail;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return this.nim;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void daftarNama() {
        do {
            System.out.print("Masukkan Nama: ");
            this.setNama(input.nextLine());
            String angka = "[\\p{Digit} && [1234567890]]+";
            if(this.getNama().matches(angka) == true) {
                System.out.println("NAMA TIDAK BOLEH BERUPA ANGKA");
                cek = true;
            }else if(this.getNama().isEmpty()){
                System.out.println("MOHON UNTUK DIISI");
                cek = true;
            }else {
                cek = false;
            }
        }while(cek);
    }

    public void daftarNim(){
        do {
            try {
                System.out.print("Masukkan Nim Kamu : ");
                nim = input.nextLine();
                String subNim = nim.substring(4,12);

                if(!subNim.equals("10370311")){
                    throw new Exception("Salah input NIM tidak sama");
                }

                if(nim.length() != 15){
                    throw new Exception("Salah input NIM nim kurang/lebih");
                } else{
                    cek = false;
                    System.out.println("NIM Anda telah ter input");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }while(cek);
    }

    public void daftarEmail() {
        do {
            try {
                System.out.print("Masukkan Email: ");
                this.setEmail(input.nextLine());
                if(this.getEmail().endsWith(this.getkodeemail()) == true) {
                    if(this.getEmail().length() <=18){
                        System.out.println("JUMLAH KARAKTER HARUS LEBIH DARI 18");
                        cek = true;
                    }else {
                        cek = false;
                    }

                }else {
                    cek = true;
                    throw new Exception ("HARUS BERAKHIRAN @webmail.umm.ac.id");
                }
            }catch(Exception e) {
                System.out.println(e);
            }
        }while(cek);
    }

    public void daftarNoTelp() {
        do {
            System.out.print("Masukkan No Telepon:");
            this.setNoTelp(input.nextLine());
            String angka = "[\\p{Digit} && [1234567890]]+";
            if(this.getNoTelp().matches(angka)) {
                if(this.getNoTelp().length() != 12) {
                    System.out.println("MASUKKAN JUMLAH NOMOR TELEPON DENGAN BENAR");
                    cek = true;
                }else {
                    cek = false;
                }

            }else if(this.getNoTelp().isEmpty()){
                System.out.println("MOHON UNTUK DIISI");
                cek = true;
            }else {
                cek = true;
                System.out.println("INPUTAN HARUS BERUPA ANGKA");
            }
        }while(cek);
    }
}