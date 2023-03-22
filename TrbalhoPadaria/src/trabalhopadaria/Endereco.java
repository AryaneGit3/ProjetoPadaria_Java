
package trabalhopadaria;

import java.util.Scanner;

public class Endereco {
    
    Scanner input = new Scanner(System.in);
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    // Contrutor Endereço:
    
    public Endereco(String es, String ci, String ba, String ru, int nu) {
        this.estado = es;
        this.cidade = ci;
        this.bairro = ba;
        this.rua = ru;
        this.numero = nu;
    }


    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int cep) {
        this.numero = numero;
    }
    //----------------------------------------------------
    public void CadastrarEndereço() {
        
        System.out.println("Informe o estado do seu estabelecimento: ");
        estado = input.nextLine();
        System.out.println("Informe a cidade do seu estabelecimento: ");
        cidade = input.nextLine();
        System.out.println("Informe o bairro do seu estabelecimento: ");
        rua = input.nextLine();
        System.out.println("Informe o numero do seu estabelecimento: ");
        numero = input.nextInt();
    }
    
    //---------------------------------------------------------------------
    
    public void mostrarEndereco() {
        System.out.println("Nossa paadria Se localiza em:");
        System.out.println("Esado: "+this.getEstado());
        System.out.println("Cidade: "+this.getCidade());
        System.out.println("Bairro: "+this.getBairro());
        System.out.println("Numero: "+this.getNumero());
      
        
        
    }
    
}
