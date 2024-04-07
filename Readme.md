<h1> 🔅 Condições e Regras 🔅</h1>

<div>
 O Sistema deve possuir um menu que disponibilize as seguintes opções:
<hr />
⚬ Cadastro de Produtos;
 <br>
⚬ Cadastro de Cliente;
 <br>
⚬ Cadastro de Vendedores;
 <br>
⚬ Listar Clientes;
 <br>
⚬ Listar Produtos;
 <br>
⚬ Listar Vendedores;
 <br>
⚬ Listar Pedidos;
 <br>
⚬ Total Bruto de Vendas;
 <br>
⚬ Total Liquido de Vendas;
 <br>
⚬ Sair
<hr /> 
</div>

<h2> ---REGRAS--- </h2>
<hr /> 
<div> 
 -- Deve ser lançada a exception RegistroNaoEcontradoException sempre que um registro não for encontrado ex: Produto, Cliente, Vendedor;
 <br>
 -- Deve ser lançada a exception QuantidadeNaoPermitidaException quando a quantidade solicitada no PedidoItem for maior que a Quantidade Maxima permitida em produto;
 <br>
 -- Deve ser lançada a exception ItemDuplicadoException cada vez que um item for adicionado a segunda vez ao pedido. Exemplo: não é permitido ter duas vezes o produto Televisão em Pedido o correto é ter uma Televisão com quantidade igual a 2;
 <br>
 -- A opções listar Clientes, Produtos e Vendedores deve listar os mesmos em ordem Alfabética crescente;
 <br>
 -- A opção listar Produtos deve listar os produtos por ordem de Valor decrescente;
 <br>
 -- A opção total Bruto de vendas deve exibir o total de Vendas;
 <br>
 -- A opção total Liquida de vendas deve exibir o total de Vendas com o valor das comissões de vendedores descontada.
 <hr /> 

</div>
