package terminal;

public class AboutMe {
    public static void main(String[] args) {

        // arguments to be passed in the terminal

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); // Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
