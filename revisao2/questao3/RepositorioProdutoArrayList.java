package questao3;

import java.util.ArrayList;

public class RepositorioProdutoArrayList implements RepositorioProdutos {

	ArrayList<Produto> produtos;

	public RepositorioProdutoArrayList() {
		super();
		produtos = new ArrayList<Produto>();
	}

	@Override
	public int procurarIndice(int codigo) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCodigo() == codigo) {
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
		produtos.add(produto);
	}

	@Override
	public void atualizar(Produto produto) {
		if (produtos.contains(produto)) {
			produtos.remove(produto);
			produtos.add(produto);
		} else {
			throw new RuntimeException("Produto não encontrado");
		}
	}

	@Override
	public void remover(int codigo) {
		int i = procurarIndice(codigo);
		produtos.remove(i);
	}

	@Override
	public Produto procurar(int codigo) {
		int i = procurarIndice(codigo);
		return produtos.get(i);
	}

}