
package trabalhopadaria;
import java.util.Scanner;

/**
 *
 * @author aryan
 */
public class Produto {
    
    private String codProd;
    private String nomeProd;
    private String precoCusto;
    private String precoVenda;
    private String dataValidade;
    private String lote;
    int qtdLote;

 
    public String getCodProd() {
        return codProd;
    }

    /**
     * @param codProd the codProd to set
     */
    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    /**
     * @return the nomeProd
     */
    public String getNomeProd() {
        return nomeProd;
    }

    /**
     * @param nomeProd the nomeProd to set
     */
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    /**
     * @return the precoCusto
     */
    public String getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return the precoVenda
     */
    public String getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the dataValidade
     */
    public String getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the lote
     */
    public String getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(String lote) {
        this.lote = lote;
    }

    /**
     * @return the qtdLote
     */
    public int getQtdLote() {
        return qtdLote;
    }

    /**
     * @param qtdLote the qtdLote to set
     */
    public void setQtdLote(int qtdLote) {
        this.qtdLote = qtdLote;
    }
    
    public void cadastrarProduto(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o código do produto:");
        setCodProd(scanner.next());
        
        System.out.println("Informe o nome do produto:");
        setNomeProd(scanner.next());
        
        System.out.println("Informe o preço de custo do produto:");
        setPrecoCusto(scanner.next());
        
        System.out.println("Informe o preço de venda do produto:");
        setPrecoVenda(scanner.next());
        
        System.out.println("Informe a data de validade desse produto:");
        setDataValidade(scanner.next());
        
        System.out.println("Informe o lote do produto:");
        setLote(scanner.next());
        
        System.out.println("Informe a quantidade de produtos desse lote:");
        setQtdLote(scanner.nextInt());
        
    }// fim cadastrar produto
    
    public void mostraProduto(){
        
        System.out.println("*** DADOS DO PRODUTO ***");
        System.out.println("\nCódigo do produto:"+getCodProd());
        System.out.println("\nNome do produto:"+getNomeProd());
        System.out.println("\nPreço de custo do produto:"+getPrecoCusto());
        System.out.println("\nPreço de venda do produto:"+getPrecoVenda());
        System.out.println("\nData de validade do produto:"+getDataValidade());
        System.out.println("\nLote do produto:"+getLote());
        System.out.println("\nQuantidade de produtos do lote:"+getQtdLote());
   
    } // fim mostra produto
      
}


