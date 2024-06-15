public class LimparTela {
    public static void limpar() {
        System.out.println("limpando tela");
        System.out.print("\033[Ha\033[2J");
        System.out.flush();
    }

}
