package PrimeraEntrega;

public class RecorrerArreglos {

	public static void main(String[] args) {
		
		String[] mes = new String[12];
		String[] mes2 = new String[12];
		mes[0] = "Enero";
		mes[1] = "Febrero";
		mes[2] = "Marzo";
		mes[3] = "Abril";
		mes[4] = "Mayo";
		mes[5] = "Junio";
		mes[6] = "Julio";
		mes[7] = "Agosto";
		mes[8] = "Septiembre";
		mes[9] = "Octubre";
		mes[10] = "Noviembre";
		mes[11] = "Diciembre";
		
		for(int i=0;i<12;i++) {
			System.out.println("mes "+(i+1)+" = "+mes[i]);
		}
		System.out.println("--------------------------------");
		
		mes2[0] = mes[10];
		mes2[1] = mes[11];
		mes2[2] = mes[0];
		mes2[3] = mes[1];
		mes2[4] = mes[2];
		mes2[5] = mes[3];
		mes2[6] = mes[4];
		mes2[7] = mes[5];
		mes2[8] = mes[6];
		mes2[9] = mes[7];
		mes2[10] = mes[8];
		mes2[11] = mes[9];

		for(int i=0;i<12;i++) {
			System.out.println("mes "+(i+1)+" = "+mes2[i]);
		}
	}
}
