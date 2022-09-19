package miniProje3;

public class Main {

	public static void main(String[] args) {
		int sayi = 28;
		int sayac = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac = sayac + i;
			}
		}

		if (sayi == sayac) {
			System.out.println(sayi + " mükemmel sayıdır.");
		} else {
			System.out.println(sayi + " mükemmel sayıdı değildir.");
		}

	}

}
