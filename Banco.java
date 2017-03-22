package aula05;

public class Banco {
		private String nome;
		private Conta[] contas;
		
		public Banco(String nome, int n){
			this.setNome(nome);
			this.setContas(new Conta[n]);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Conta[] getContas() {
			return contas;
		}

		public void setContas(Conta[] contas) {
			this.contas = contas;
		}
		
		public Conta procurarConta(String conta){
			for(int i = 0; i < getContas().length; i++){
				if(getContas()[i].getNumConta().equals(conta))
					return getContas()[i];
			}
			return null;
		}

	

}
