

import java.util.Scanner;

public class Atendimento {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Usuario usuario = new Usuario();
        int contadorPessoa = 0;
        Fila fila = new Fila();
        while (true) {

            System.out.println("Digite 1 para sair da aplicação ");
            System.out.println("Digite 2 para adicionar um usuário ");
            System.out.println("Digite 3 para chamar o próximo usuário");
            System.out.println("Digite 4 para mostrar a lista de usuário");

            int opcao = leitura.nextInt();
            leitura.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("");
                    System.out.println("Aplicação encerrada");
                    break;

                case 2:
                    
                    System.out.println("Digite o nome da pessoa");
                    usuario.setNome(leitura.nextLine());
                    String nome = usuario.getNome();
                    fila.adiciona(nome);
                    contadorPessoa++;
                    System.out.println("Usuário cadastrado: " + nome + " " + contadorPessoa );
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Primeiro da fila " + fila.remove());
                    System.out.println("Proxima da fila " + fila.remove());
                    
                    break;
                case 4:
                fila.exibe();
            }

            if (opcao == 1) {
                break;
            }
        }

        leitura.close();
    }
}