public class Fila {


    private ListaEncadeada lista = new ListaEncadeada();
   
    /**
     * operação de enqueue
     */
    public void adiciona(Object elemento) {
     this.lista.insere(elemento, this.lista.tamanho());
    }
   
   
    /**
     * operação de dequeue
     */
    public Object remove() {
     Object elemento = this.lista.seleciona(0);
     this.lista.remove(0);
     return elemento;
    }
   
   
    public void exibe() {
     System.out.println();
     for (int i = 0; i < this.lista.tamanho(); i++) {
      System.out.print(this.lista.seleciona(i));
     }
     System.out.println();
    }
   
   
    public int tamanho() {
     return this.lista.tamanho();
    }
   
   
   }
   