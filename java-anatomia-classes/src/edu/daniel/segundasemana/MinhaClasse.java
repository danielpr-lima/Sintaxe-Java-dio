package edu.daniel.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        // lesson one
        System.out.println("Olá você que acessou meu gitHub!!");

        //lesson two
        // essa variavel não pode ser alterada e deve ser escrita de forma maiuscula
        // final String BR = "Brasil";
        // final Double PI = 3.14;

        String primeiroNome ="Daniel";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }   

    // lesson 3

    // variavel
    // Tipo NomeBemDefenido = atribuição (que é opcional)

    // metodo
    // TipoRetorno NomeObjetivoNoInfinitivo (parametro(s))
    // int somar(int numero Um, int numero2)
    // String formatarCep(long cep)

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);            
    }
}