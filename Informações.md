O Sistema deve possuir um menu que disponibilize as seguintes opções:

 

Cadastro de Produtos
Cadastro de Cliente
Cadastro de Vendedores
Listar Clientes
Listar Produtos
Listar Vendedores
Listar Pedidos
Total Bruto de Vendas
Total Liquido de Vendas
Sair


Use os conhecimentos aprendidos em aula até então para construir a solução (Orientação a Objetos, Tratamento de exceções, Collections Framework).

Regras

Deve ser lançada a exception RegistroNaoEcontradoException sempre que um registro não for encontrado ex: Produto, Cliente, Vendedor;
Deve ser lançada a exception QuantidadeNaoPermitidaException quando a quantidade solicitada no PedidoItem for maior que a Quantidade Maxima permitida em produto
Deve ser lançada a exception ItemDuplicadoException cada vez que um item for adicionado a segunda vez ao pedido. Exemplo: não é permitido ter duas vezes o produto Televisão em Pedido o correto é ter uma Televisão com quantidade igual a 2;
A opções listar Clientes, Produtos e Vendedores deve listar os mesmos em ordem Alfabética crescente.
A opção listar Produtos deve listar os produtos por ordem de Valor decrescente.
A opção total Bruto de vendas deve exibir o total de Vendas
A opção total Liquida de vendas deve exibir o total de Vendas com o valor das comissões de vendedores descontada.
