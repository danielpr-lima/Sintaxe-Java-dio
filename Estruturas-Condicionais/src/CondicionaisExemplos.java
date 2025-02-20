public class CondicionaisExemplos {
    public static void main(String[] args) {
        // Condicional Simples (if)
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Condicional Simples: Você é maior de idade.");
        }

        // Condicional Composta (if-else)
        int idade2 = 16;
        if (idade2 >= 18) {
            System.out.println("Condicional Composta: Você é maior de idade.");
        } else {
            System.out.println("Condicional Composta: Você é menor de idade.");
        }

        // Condicional Encadeada (if-else if-else)
        int nota = 75;
        if (nota >= 90) {
            System.out.println("Condicional Encadeada: A");
        } else if (nota >= 80) {
            System.out.println("Condicional Encadeada: B");
        } else if (nota >= 70) {
            System.out.println("Condicional Encadeada: C");
        } else {
            System.out.println("Condicional Encadeada: D");
        }

        // Condicional Ternária
        int idade3 = 20;
        String status = (idade3 >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Condicional Ternária: " + status);

        // Switch-Case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Switch-Case: Domingo");
                break;
            case 2:
                System.out.println("Switch-Case: Segunda");
                break;
            case 3:
                System.out.println("Switch-Case: Terça");
                break;
            default:
                System.out.println("Switch-Case: Dia inválido");
                break;
        }
    }
}