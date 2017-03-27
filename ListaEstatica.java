package exercicios;
import java.util.Arrays;

public class ListaEstatica {
	private int[] lista;
	private int tamanho;
	
	public ListaEstatica(int n){
		this.tamanho = 0;
		this.lista = new int[n];
		Arrays.fill(lista, -1);
	}
	public void add(int n){
		if(this.tamanho != lista.length){
			this.lista[tamanho] = n;
			this.tamanho++;
		}
	}
	
	public void remove(int index){
		for(int i = this.tamanho-1; i > index; i--)
			this.lista[i-1] = lista[i];
		this.tamanho--;
	}
	
	public void ordenarLista(){
		int aux = 0;
		for(int i = 0; i < tamanho-1; i++){
			for(int j = i+1; j < tamanho; j++){
				aux = lista[i];
				lista[i] = j;
				lista[j] = aux;
			}
		}
	}
	public int[] getLista() {
		return lista;
	}
	public void setLista(int[] lista) {
		this.lista = lista;
	}
	

}
