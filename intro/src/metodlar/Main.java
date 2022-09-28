package metodlar;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer(aranacak + " sayısı dizi içerisinde yer almaktadır.");
		} else {
			mesajVer(aranacak + " sayısı dizi içerisinde yoktur.");
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
