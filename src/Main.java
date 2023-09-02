import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el mensaje:");
        String mensaje = scanner.nextLine();
        System.out.println("Cuántas veces quieres mover la letra:");
        int veces = scanner.nextInt();
        int ascii;
        scanner.nextLine();
        StringBuilder mensajeCifrado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            boolean minuscula = (letra >= 'a' && letra <= 'z');
            boolean mayuscula = (letra >= 'A' && letra <= 'Z');
            if (!(minuscula || mayuscula)) {
                mensajeCifrado.append(letra);
            } else {
                ascii =  letra;
                int baseAscii =  'a';

                if (mayuscula) {
                    baseAscii =  'A';
                }

                int nuevoAscii = (ascii - baseAscii + veces) % 26 + baseAscii;
                char nuevaLetra = (char) nuevoAscii;
                mensajeCifrado.append(nuevaLetra);
            }
        }

        System.out.println(mensajeCifrado);

    }
}

