package src.p03.c01;

import java.util.Random;

import src.p03.c01.IParque;

public class ActividadSalidaPuerta implements Runnable{

	private static final int NUMENTRADAS = 20;
	private IParque parque;
	private String puerta;
	
	public ActividadSalidaPuerta(String puerta, IParque parque) {
		this.puerta = puerta;
		this.parque = parque;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < NUMENTRADAS; i++) {
			for(int j = 0; j < 10000; j++) {
				this.parque.salirDelParque(puerta);
			}
			try {
				Thread.sleep(new Random().nextInt(5)*1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
