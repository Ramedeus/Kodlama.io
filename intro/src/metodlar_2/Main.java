package metodlar_2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(10,5);
		System.out.println(sayi);
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
	
	public static int topla(int x,int y) {
		return x+y;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
