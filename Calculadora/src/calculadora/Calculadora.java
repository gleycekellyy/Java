package calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        System.out.println("Calculadora de média.");
        System.out.println("Digite a primeira média");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda média");
        nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira média");
        nota3 = leitor.nextDouble();
        System.out.println("Digite a quarta média");
        nota4 = leitor.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println(media);
        
     if (media > 6 ) {
    System.out.println("Aprovado");
}
     else if (media < 6 ){
    System.out.println("Reprovado");

}
    
    }
    
}
