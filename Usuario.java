public class Usuario {
    private static int contador;
    private int numero;
    private String nome;



    public Usuario() {
        this.numero = contador++;
    }

    public int getNumero() {
        return numero;
    }

    
    public String getNome() {
        return nome;
    }

    

    @Override
    public String toString() {
        return getNome() + numero;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

}
