package questao3;

public interface RepositorioProdutos {

	public abstract int procurarIndice(int codigo);

	public abstract boolean existe(int codigo);

	public abstract void inserir(Produto produto);

	public abstract void atualizar(Produto produto);

	public abstract void remover(int codigo);

	public abstract Produto procurar(int codigo);

}