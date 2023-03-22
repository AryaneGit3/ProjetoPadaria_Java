package trabalhopadaria;
import java.util.Scanner;

/**
 *
 * @author aryan
 */
public class Funcionario {
    
    private String cpfFunci;
    private String nomeFunci;
    private String dataNascimentoFunci;
    private String dataAdmissao;
    private String telefoneFunci;
    private String emailFunci;

    /**
     * @return the cpfFunci
     */
    public String getCpfFunci() {
        return cpfFunci;
    }

    /**
     * @param cpfFunci the cpfFunci to set
     */
    public void setCpfFunci(String cpfFunci) {
        this.cpfFunci = cpfFunci;
    }

    /**
     * @return the nomeFunci
     */
    public String getNomeFunci() {
        return nomeFunci;
    }

    /**
     * @param nomeFunci the nomeFunci to set
     */
    public void setNomeFunci(String nomeFunci) {
        this.nomeFunci = nomeFunci;
    }

    /**
     * @return the dataNascimentoFunci
     */
    public String getDataNascimentoFunci() {
        return dataNascimentoFunci;
    }

    /**
     * @param dataNascimentoFunci the dataNascimentoFunci to set
     */
    public void setDataNascimentoFunci(String dataNascimentoFunci) {
        this.dataNascimentoFunci = dataNascimentoFunci;
    }

    /**
     * @return the dataAdmissao
     */
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the telefoneFunci
     */
    public String getTelefoneFunci() {
        return telefoneFunci;
    }

    /**
     * @param telefoneFunci the telefoneFunci to set
     */
    public void setTelefoneFunci(String telefoneFunci) {
        this.telefoneFunci = telefoneFunci;
    }

    /**
     * @return the emailFunci
     */
    public String getEmailFunci() {
        return emailFunci;
    }

    /**
     * @param emailFunci the emailFunci to set
     */
    public void setEmailFunci(String emailFunci) {
        this.emailFunci = emailFunci;
    }
    
   public void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionario: ");
        setNomeFunci(scanner.next());

        System.out.println("Informe o CPF do funcionario: ");
        setCpfFunci(scanner.next());

        System.out.println("Informe a data de nascimento do funcionario (formato dd/mm/yyyy):");
        setDataNascimentoFunci(scanner.next());
        
         System.out.println("Informe a data de admissao do funcionario (formato dd/mm/yyyy):");
        setDataAdmissao(scanner.next());


        System.out.println("Informe o telefone do funcionario:");
        setTelefoneFunci(scanner.next());

        System.out.println("Informe o e-mail do funcionario: ");
        setEmailFunci(scanner.next());
           
} // fim cadastra funcionario
   
        void mostraFuncionario(){
        
        System.out.println(" *** DADOS DO FUNCIONARIO *** ");
        System.out.println("\n Nome do Funcionario:"+getNomeFunci());
        System.out.println("\n CPF do Funcionario:"+getCpfFunci());
        System.out.println("\n Data de nascimento do Funcionario:"+getDataNascimentoFunci());
        System.out.println("\n Data de nascimento de Admissao do Funcionario:"+getDataAdmissao());
        System.out.println("\n Teelfone do Funcionario:"+getTelefoneFunci());
        System.out.println("\n E-mail do Funcionario:"+getEmailFunci());
   
} // fim mostra funcionario
        
        
}
    
     