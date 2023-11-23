import java.util.Scanner;

public class UcapanTerimaKasih_28 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih() {
        System.out.println ("Thank you for being the best teacher in the world. \n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void main(String[] args){
        UcapanTerimakasih();
    }
    
}
