package terceraEntrega;

public class Personaje {
		
		String nombre;
		int fuerza;
		int vida;
		boolean vivo;
		int posicionX;
		int posicionY;
		
		
		public Personaje() {
			super();
			this.nombre = "desconocido";
			this.fuerza = 0;
			this.vida = 100;
			this.vivo = true;
		}


		@Override
		public String toString() {
			return nombre + "(" +vida+ ")";
		}
		
		public static void ataque (Personaje atacante,Personaje defensor) {
			defensor.vida -= atacante.fuerza;
			if(defensor.vida < 0) {
				defensor.vivo = false;
			}
		}
		
		public void ataqueA(Personaje oponente) {
			//this sera el atacante y oponente sera el defensor
			oponente.vida -= this.fuerza;
			//if(oponente) {
				
			//}
		}

		public void cura(int cantidadVida) {
			this.vida += cantidadVida;
		}

}
