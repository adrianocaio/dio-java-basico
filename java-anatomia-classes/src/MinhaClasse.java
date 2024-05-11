public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Adriano";
        String segundoNome = "Caio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
