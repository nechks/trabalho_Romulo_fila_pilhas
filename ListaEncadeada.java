

class No {


    Object valor;
    No proximo;
   
   
    public No(Object v, No p) {
     valor = v;
     proximo = p;
    }
   
   
    public String toString() {
     return "" + valor;
    }
   
   
    public boolean equals(Object outro) {
     return valor.equals(((No) outro).valor);
    }
   }
   
   
   public class ListaEncadeada {
   
   
    private int n = 0;
    private No inicio = null;
   
   
    public int tamanho() {
     return n;
    }
   
   
    public boolean equals(ListaEncadeada l2) {
     if (l2.n == n) {
      int contador = 0;
      No atual = inicio;
      No atual2 = l2.inicio;
      while (contador < n && atual.valor.equals(atual2.valor)) {
       atual = atual.proximo;
       atual2 = atual2.proximo;
       contador++;
      }
      if (contador == n) {
       return true;
      }
     }
     return false;
    }
   
   
    public void insere(Object valor) {
     insere(valor, 0);
    }
   
   
    public void insere(Object valor, int posicao) {
     if (posicao >= 0 && posicao <= n) {
      int contador = 0;
      No anterior = null;
      No atual = inicio;
   
   
      while (contador < posicao) {
       anterior = atual;
       atual = atual.proximo;
       contador++;
      }
   
   
      if (atual == null && anterior == null) {
       //não tem nenhum elemento inserido na lista
       inicio = new No(valor, null);
      } else if (atual == null) {
       //a posição para inserir é na ponta final
       atual = new No(valor, null);
       anterior.proximo = atual;
      } else if (anterior == null) {
       //a posição de inserção é no início mas já existe um elemento
       inicio = new No(valor, atual);
      } else {
       //deve ser inserido no meio da lista
       atual = new No(valor, atual);
       anterior.proximo = atual;
      }
   
   
      n++;
   
   
     } else {
      System.err.println("Posicao invalida [n=" + n + ", p=" + posicao + "]");
     }
    }
   
   
    public void remove(int posicao) {
     if (posicao >= 0 && posicao < n) {
      int contador = 0;
      No anterior = null;
      No atual = inicio;
   
   
      while (contador < posicao) {
       anterior = atual;
       atual = atual.proximo;
       contador++;
      }
   
   
      if (atual != null && anterior != null) {
       //remove no meio da lista
       anterior.proximo = atual.proximo;
      } else if (anterior == null) {
       //remove no início da lista
       inicio = atual.proximo;
      }
   
   
      n--;
   
   
     } else {
      System.err.println("Posicao invalida [n=" + n + ", p=" + posicao + "]");
     }
    }
   
   
    public Object seleciona(int posicao) {
     if (posicao >= 0 && posicao < n) {
      int contador = 0;
      No atual = inicio;
   
   
      while (contador < posicao) {
       atual = atual.proximo;
       contador++;
      }
      return atual.valor;
     }
     return null;
    }
   
   
    public void exibe() {
     No atual = inicio;
     while (atual != null) {
      System.out.print(atual.valor + ", ");
      atual = atual.proximo;
     }
     System.out.println("");
    }
   }
   