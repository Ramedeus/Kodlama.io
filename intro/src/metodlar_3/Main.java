package metodlar_3;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(10, 5);
		System.out.println(sayi);
		System.out.println(topla2(1, 2, 3, 4));
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void guncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int x, int y) {
		return x + y;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;

		for (int sayi : sayilar) {
			toplam += sayi;
		}

		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
