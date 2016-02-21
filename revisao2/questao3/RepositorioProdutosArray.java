package questao3;

public class RepositorioProdutosArray implements RepositorioProdutos {

	private Produto[] produtos;
	private int indice;
	private int tamanho;

	public RepositorioProdutosArray(int tamanho) {
		this.produtos = new Produto[tamanho];
		this.indice = 0;
		this.tamanho = tamanho;
	}

	@Override
	public int procurarIndice(int codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i].getCodigo() == codigo) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public boolean existe(int codigo) {
		if (procurarIndice(codigo) != -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void inserir(Produto produto) {
		if (!(indice > tamanho)) {
			produtos[indice] = produto;
			indice++;
		} else {
			throw new RuntimeException("Array de Produtos já está cheio");
		}
	}

	@Override
	public void atualizar(Produto produto) {
		int i = procurarIndice(produto.getCodigo());
		if (i != -1) {
			produtos[i] = produto;
		} else {
			throw new RuntimeException("Produto não encontrado");
		}
	}

	@Override
	public void remover(int codigo) {
		int i = procurarIndice(codigo);
		if (i != -1) {
			produtos[i] = produtos[indice - 1];
			produtos[indice - 1] = null;
			indice--;
		} else {
			throw new RuntimeException("Produto não encontrado");
		}
	}

	@Override
	public Produto procurar(int codigo) {
		int i = procurarIndice(codigo);
		if (i != -1) {
			return produtos[i];
		} else {
			throw new RuntimeException("Produto não encontrado");
		}
	}

}