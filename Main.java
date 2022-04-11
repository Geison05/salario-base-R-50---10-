import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
   //Variavel 
   double salarioBase = 0.0,
          SalarioNovo = 0.0,
          gratif = 50.0, 
          imposto = 0.0;
  // entrada de dados 
  System.out.print("Salario Base : R$ ");
  salarioBase = leitor.nextDouble();
  //Processamento 
  imposto = 0.10 * salarioBase;
  SalarioNovo = (salarioBase + gratif) - imposto  ;
  //saida
  System.out.print("Salario base : R$ " + SalarioNovo );

  }
}