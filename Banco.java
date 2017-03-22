package aula05;

import java.util.ArrayList;

public class Banco {
		private String nome;
		private ArrayList<Conta> contas;
		
		public Banco(String nome){
			this.setNome(nome);
			this.setContas(new ArrayList<Conta>());
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		
		
		public ArrayList<Conta> getContas() {
			return contas;
		}

		public void setContas(ArrayList<Conta> contas) {
			this.contas = contas;
		}

		public Conta procurarConta(String conta){
			for(int i = 0; i < getContas().size(); i++){
				if(getContas().get(i).getNumConta().equals(conta))
					return getContas().get(i);
			}
			return null;
		}
		public void cadastrarConta(Conta c){
			getContas().add(c);
		}
}
