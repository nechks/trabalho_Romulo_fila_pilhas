import java.util.Scanner;

public class AtendimentoA { //Pojeto aprovado e modificado

    //static int contadorPessoa = 0;

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Usuario usuario;
        
        Fila fila = new Fila();
        LimparTela.limpar();
        while (true) {
            System.out.println("Digite 1 para sair da aplicação ");
            System.out.println("Digite 2 para adicionar um usuário ");
            System.out.println("Digite 3 para chamar o próximo usuário");
            System.out.println("Digite 4 para mostrar a lista de usuário");

            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    LimparTela.limpar();
                    System.out.println("");
                    System.out.println("Aplicação encerrada");
                    break;

                case 2:
                    usuario = new Usuario();
                    System.out.println("Digite o nome da pessoa");
                    //contadorPessoa++;
                    usuario.setNome(leitura.nextLine());
                    //String nome = usuario.getNome();
                    fila.adiciona(usuario);
                    LimparTela.limpar();
                    System.out.println("Usuário cadastrado: " + usuario.getNome() + " " + usuario.getNumero());
                    System.out.println();

                    break;
                case 3:
                    LimparTela.limpar();
                    System.out.println("Primeiro da fila " + fila.remove());
                   //System.out.println("Proxima da fila " + fila.remove());

                    break;
                case 4:
                    LimparTela.limpar();
                    fila.exibe();
            }

            if (opcao == 1) {
                break;
            }
        }

        leitura.close();
    }
}