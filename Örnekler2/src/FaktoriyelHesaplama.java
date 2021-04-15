import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		
	Scanner sayi = new Scanner(System.in);
	System.out.println("Faktöriyelini Hesaplamak Ýstediðiniz Sayýyý Giriniz.");
	int f;
	f = sayi.nextInt();
	int sonuc = 1;
	
	while(f > 0) {
		sonuc *= f;
		f--;
	}
	System.out.print("Sonuç: "+sonuc);

	}

}
