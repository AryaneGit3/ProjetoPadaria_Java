
package trabalhopadaria;
import java.util.Scanner;

/**
 *
 * @author aryan
 */
public class Cliente {
        
    
        private String cpfCliente;
        private String nomeCliente;
        private String dataNascimentoCli;
        private String telefoneCliente;
        private String emailCliente;

    /**
     * @return the cpf
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpfCliente(String cpf) {
        this.cpfCliente = cpfCliente ;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimentoCli() {
        return dataNascimentoCli;
    }

    /**
    
     */
    public void setDataNascimentoCli(String dataNascimentoCli) {
        this.dataNascimentoCli = dataNascimentoCli;
    }

    /**
     * @return the telefoneCliente
     */
    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    /**
     * @param telefoneCliente the telefoneCliente to set
     */
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    /**
     * @return the emailCliente
     */
    public String getEmailCliente() {
        return emailCliente;
    }

    /**
     * @param emailCliente the emailCliente to set
     */
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
      
    //----------------------------------------------------
    
    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do cliente: ");
        setNomeCliente(scanner.next());

        System.out.println("Informe o CPF do cliente: ");
        setCpfCliente(scanner.next());

        System.out.println("Informe a data de nascimento do cliente (formato dd/mm/yyyy):");
        setDataNascimentoCli(scanner.next());

        System.out.println("Informe o telefone do cliente:");
        setTelefoneCliente(scanner.next());

        System.out.println("Informe o e-mail do cliente: ");
        setEmailCliente(scanner.next());
        
    } // fim cadastro cliente padaria -------------------------------------------------------
    
    void mostraCliente(){
        
        System.out.println(" *** DADOS DO CLIENTE *** ");
        System.out.println("\n Nome do Cliente:"+getNomeCliente());
        System.out.println("\n CPF do cliente:"+getCpfCliente());
        System.out.println("\n Data de nascimento do Cliente:"+getDataNascimentoCli());
        System.out.println("\n Teelfone do Cliente:"+getTelefoneCliente());
        System.out.println("\n E-mail do Cliente:"+getEmailCliente());
        
    } //  fim mostra cliente padaria ----------------------------------------------------------
    
    
    
    
    
}
