package vıcutKitleEndeksi;

public class Main {

	public static void main(String[] args) {
		double agarlik = 53;
		double boy = 1.76;
		double vki = agarlik / (boy * boy);
		if (vki >= 0 && vki < 18.4) {
			System.out.println("Zayıf");
		}
		if (vki >= 18.5 && vki < 24.9) {
			System.out.println("Normal");
		}
		if (vki >= 25.0 && vki < 29.9) {
			System.out.println("Fazla Kilolu");
		}
		if (vki >= 30.0 && vki < 34.9) {
			System.out.println("Şişman(Obez)");
		}
		if (vki >= 35.0 && vki < 44.9) {
			System.out.println("Aşırı Şişman(Aşırı Obez)");
		}
		if (vki >= 45.0) {

		}
	}

}
