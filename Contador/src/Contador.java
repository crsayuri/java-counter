import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {

    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");

    int parametroUm = Integer.valueOf(terminal.next());

    System.out.println("Digite o segundo parâmetro");

    int parametroDois = Integer.valueOf(terminal.next());

    try {
      // chamando o método contendo a lógica de contagem

      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException ex) {
      // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println(ex.getMessage());
    }

  }

  public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

    int contagem = parametroDois - parametroUm;
    // realizar o for para imprimir os números com base na variável contagem
    System.out.println("O resultado é: ");
    if (parametroUm < parametroDois) {

      for (int i = 1; i <= contagem; i++) {
        System.out.println(i);
      }

    } else {
      throw new ParametrosInvalidosException("Erro! O segundo parametro deve ser maior que o primeiro");
    }
  }
}
