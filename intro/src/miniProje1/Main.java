package miniProje1;

public class Main {

	public static void main(String[] args) {
		int sayi = 67;
		int sayac = 0;
		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}
		}

		if (sayac == 2) {
			System.out.println(sayi + " asaldır. ");
		} else if (sayac > 2) {
			System.out.println(sayi + " asal değildir.");
		} else {
			System.out.println("0 veya - değerlikli sayılar asal sayı kapsamına dahil edilmez");
		}

	}
}
