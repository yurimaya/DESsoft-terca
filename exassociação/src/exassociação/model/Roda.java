package exassociação.model;

	public class Roda {
		
		public boolean isFurada = false;
		public String nome;
		public int tamanho;
		public int quantidade;
		private Roda rodaDianteiraEsquerda;
		private Roda rodaDianteiraDireita;
		private Roda rodaTraseiraEsquerda;
		private Roda rodaTraseiraDireita;
	}