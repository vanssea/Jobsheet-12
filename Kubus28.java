import java.util.Scanner;

public class Kubus28{
    static int hitungVolume(int s){
        int Volume= s*s*s;
        return Volume;
    }
    static int hitungLuar(int s){
        int Luar= 6*(s*s);
        return Luar;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi= sc.nextInt();

        int vol= hitungVolume(sisi);
        int Lr= hitungLuar(sisi);
        System.out.println("Volume kubus: "+vol);
        System.out.println("Luar Permukaan: "+Lr);
        sc.close();
    }
}