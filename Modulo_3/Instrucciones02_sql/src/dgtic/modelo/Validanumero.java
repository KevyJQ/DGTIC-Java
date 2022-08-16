package dgtic.modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validanumero {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int pedirNumero(String msg, String errorMsg) {
		int num = -1;
		boolean valid = false;

		do {
			try {
				String value = sc.nextLine();
				num = Integer.parseInt(value);
				valid = true;
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println(errorMsg);
			}
		} while (!valid);

		return num;
	}

	public static int pedirNumeroEntreRango(String msg, String errorMsg, int limiteInferiorInclusivo,int limiteSuperiorInclusivo) {
		int num = -1;
		boolean valid = false;

		do {
			num = pedirNumero(msg, errorMsg);
			if (num >= limiteInferiorInclusivo && num <= limiteSuperiorInclusivo) {
				valid = true;
			} else {
				System.out.println(errorMsg);
			}
		} while (!valid);

		return num;
	}
}
