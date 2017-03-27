package exercicios;

import java.util.ArrayList;

public class TV {
	private String marca;
	private String tipo;
	private ArrayList<Integer> canais;
	private boolean status;
	
	
	
	public TV(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
		this.canais = new ArrayList<Integer>();
		this.status = false;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList<Integer> getCanais() {
		return canais;
	}
	public void setCanais(ArrayList<Integer> canais) {
		this.canais = canais;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
