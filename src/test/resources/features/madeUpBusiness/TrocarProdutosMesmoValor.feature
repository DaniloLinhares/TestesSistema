#language: pt

  @ts2020 @trocarProdutos
  Funcionalidade: Como cliente da loja eu quero trocar
	produtos por outros do mesmo valor
	para que eu tenha os produtos certos no final

	@automated @simple
	Cenario: Realizar troca com nota fiscal válida
	  Dado o cliente compra um produto
	  E tem uma nota fiscal válida
	  Quando o funcionário inicia um pedido de troca 
	  E seleciona um novo item para troca
	  Entao o sistema registra a devolução do produto à loja
	  E emite uma nova nota fiscal


