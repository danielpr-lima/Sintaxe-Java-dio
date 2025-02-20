public class RepeticaoExmplo {

    public static void main(String[] args) {
        // For simples
        System.out.println("For simples:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração: " + i);
        }

        // For em array
        System.out.println("\nFor em array:");
        int[] numeros = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // For-each (melhor para arrays/coleções)
        System.out.println("\nFor-each em array:");
        for (int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }

        // Break
        System.out.println("\nBreak:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Sai do loop quando i for 5
            }
            System.out.println("Iteração: " + i);
        }

        // Continue
        System.out.println("\nContinue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula a iteração quando i for 3
            }
            System.out.println("Iteração: " + i);
        }

        // While
        System.out.println("\nWhile:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Do-While
        System.out.println("\nDo-While:");
        int contador2 = 1;
        do {
            System.out.println("Contador: " + contador2);
            contador2++;
        } while (contador2 <= 5);
    }

}