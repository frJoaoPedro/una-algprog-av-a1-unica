import java.util.Scanner;
public class A1provaAlgprog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        String cargo;
        int nivelDeAcesso = 0, sigilo;


        System.out.println("......Bem vindo usuário......");
        System.out.println(" Qual é o seu nome?");
        nome = sc.nextLine();
        
         System.out.println(" ===========================================");

        System.out.println("qual é o cargo que " + nome + " ocupa na empresa? ");
        System.out.println("cargos: (Cientista, Engenheiro, Zelador, Administrativo)");
        cargo = sc.nextLine();
        
        do{

        System.out.println(" Qual é o nivel de acesso de " + cargo + " " + nome + "?");
        System.out.println(" Nível de acesso entre 1 - 10");
        nivelDeAcesso = sc.nextInt();
        if (nivelDeAcesso < 1 || nivelDeAcesso > 10) {
            System.out.println("Eroo: Nível de acesso Inválido tente novamente");
        }

        }while(nivelDeAcesso < 1 || nivelDeAcesso > 10);

        System.out.println(" ===========================================");
        
        do{
        System.out.println(" Qual é o nível de sigilo que "+ nome + " quer acessar?");
        System.out.println("Sigilo vai de 1 - 10");
        sigilo = sc.nextInt();

        if (sigilo < 1 || sigilo > 10){
            System.out.println("Erro: Sigilo Inválido, tente novamente");
        }

        }while (sigilo < 1 || sigilo > 10) ;

        System.out.println(" ===========================================");
            
        
        if ( nivelDeAcesso < sigilo){
            System.out.println(nome + "( " + cargo + ") " + " - Acesso Negado! " );
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
        }
        else{
            int saldoDeAutoridade = nivelDeAcesso - sigilo;
            if ( saldoDeAutoridade == 0){
                System.out.println(nome + "( " + cargo + ") " + " - ACESSO PERMITIDO!. " + "Saldo de autoridade: " + " Sem sobra de Saldo de autoridade" );
            }
            else{
                System.out.println(nome + "( " + cargo + ") " + " - ACESSO PERMITIDO!. " + "Saldo de autoridade: " + saldoDeAutoridade );
            }

        }
        sc.close();

    }
}
