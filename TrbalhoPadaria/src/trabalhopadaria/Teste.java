/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopadaria;

/**
 *
 * @author aryana
 * 1,
 */
public class Teste {
   
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.cadastrarCliente();
        System.out.println("\n Cliente cadastrado com sucesso!");
        System.out.println("\n /////////////////////////////////////////// \n");
        cliente1.mostraCliente();
        System.out.println("\n Dados do Cliente exibidos com sucesso!\n");
        
       
        System.out.println("\n /////////////////////////////////////////// \n");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.cadastrarFuncionario();
        System.out.println("\n Funcionario cadastrado com sucesso!");
        System.out.println("\n /////////////////////////////////////////// \n");
        funcionario1.mostraFuncionario();
        System.out.println("\n Dados do funcionarios exibidos com sucesso!");
      
         
         System.out.println("\n /////////////////////////////////////////// \n");
         Fornecedor fornecedor1 = new Fornecedor();
         fornecedor1.cadastrarFornecedor();
         System.out.println("\nFornecedor cadastrado com sucesso!");
         System.out.println("\n////////////////////////////////////\n");
         fornecedor1.mostraFornecedor();
         System.out.println("\nDados do fornecedor exibidos com sucesso!");
         
         
         System.out.println("\n /////////////////////////////////////////// \n");
         Produto produto1 = new Produto();
         produto1.cadastrarProduto();
         System.out.println("\nProduto cadastrado com sucesso!");
         System.out.println("\n////////////////////////////////////\n");
         produto1.mostraProduto();
         System.out.println("\nDados do produto exibidos com sucesso!");
         
        //-----------------------------------------------------
         
         // enderecoini eh o vetor de endereço 
         
         System.out.println("\n////////////////////////////////////\n");
         
         Endereco enderecoini[] = new Endereco[2];
         
         
         enderecoini[0] = new Endereco("MG","Pouso Alegre","Cidade Jardim","Rua Hulonka",21);
         
         
         System.out.println("\n////////////////////////////////////\n");
         System.out.println(" *** LISTA DOS ENDEREÇOS CADASTRADOS:***\n " );
         enderecoini[0].mostrarEndereco();
        System.out.println("\n////////////////////////////////////\n");
        
         Produto produto2 = new Produto();
         produto2.setQtdLote(10);
         
         Venda venda1 = new Venda();
         venda1.venderProduto(produto1);
         
         venda1.devolverProduto(produto1);
    
         
    } // fim
    

}


