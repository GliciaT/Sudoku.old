public enum Dificuldade{
	FACIL(0,10), NORMAL(1,5), DIFICIL(2,3);

	private int valor;
	private int quantidadeMaximaErros;

	private Dificuldade(int valor, int quantidadeMaximaErros){
		this.valor= valor;
		this.quantidadeMaximaErros= quantidadeMaximaErros;
	}

	public int getValor(){
		return this.valor;
	}

	public int getQuantidadeMaximaError(){
		return this.quantidadeMaximaErros;
	}
}