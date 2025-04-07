import java.util.Scanner;
public class Malcelo {
    public static void main(String[]args){
        int numero = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        numero = leitor.nextInt();
        if (numero>=18){
            System.out.println("Você é maior de idade!");
        }   else {
            System.out.println("Menor de idade");
        }
        //atividade 1

        int nume;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe qualquer número: ");
        nume = leia.nextInt();
        if (nume>0){
            System.out.println("seu número é positivo");
        }   else if(nume==0){
            System.out.println("igual a zero");
        }   else{
            System.out.println("número negativo");
        }
        // atividade 2

        double nota;
        System.out.println("Coloque sua nota: ");
        Scanner libro = new Scanner(System.in);
        nota = libro.nextDouble();
        if (nota>=7){
            System.out.println("Você está aprovado!");
        }   else{
            System.out.println("Não aprovado :(");
        }
        /// atividade 3

        int num;
        System.out.println("Informe um número qualquer: ");
        Scanner leio = new Scanner(System.in);
        num = leio.nextInt();
        if (num % 2==0){
            System.out.println("Seu número é par");
        }   else {
            System.out.println("Número ímpar");
        }
        //// atividade 4

        int temp;
        Scanner termo = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        temp = termo.nextInt();
        if (temp>30){
            System.out.println("Temperatura ambiente acima dos 30 graus");
        }   else{
            System.out.println("Temperatura abaixo de 30 graus");
        }
        ///// atividade 5
    }
}

