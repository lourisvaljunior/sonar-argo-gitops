public class ExemploSonar {

    public static void main(String[] args) {
        saudacao("João");
        saudacao("Maria");
        saudacao("João"); // chamada repetida, proposital para detectar duplicação
        int resultado = soma(10, 20);
        System.out.println("Resultado: " + resultado);
        int x = 5; // variável não usada
    }

    public static void saudacao(String nome) {
        if (nome != null) {
            System.out.println("Olá, " + nome + "!");
        } else {
            System.out.println("Nome não pode ser nulo"); // mensagem pouco clara
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static void metodoInutil() {
        // método nunca chamado
        System.out.println("Isso nunca será chamado");
    }
}
