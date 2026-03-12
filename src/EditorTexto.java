import java.util.Scanner;

// Clase que implementa una pila básica usando un arreglo
class Pila {
    private String[] elementos; // Arreglo para guardar los datos
    private int tope;           // Índice que indica el último elemento

    // Constructor: inicializa la pila con una capacidad fija
    public Pila(int capacidad) {
        elementos = new String[capacidad];
        tope = -1; // -1 significa que la pila está vacía
    }

    // Método para insertar un elemento en la pila
    public void push(String dato) {
        if (!isFull()) {
            elementos[++tope] = dato;
        } else {
            System.out.println("La pila está llena. No se pudo agregar: " + dato);
        }
    }

    // Método para sacar el último elemento de la pila
    public String pop() {
        if (!isEmpty()) {
            return elementos[tope--];
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    // Método para ver el último elemento sin sacarlo
    public String peek() {
        if (!isEmpty()) {
            return elementos[tope];
        } else {
            return null;
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // Retorna el número de elementos en la pila
    public int size() {
        return tope + 1;
    }

    // Limpia la pila sin crear una nueva instancia
    public void clear() {
        for (int i = 0; i <= tope; i++) {
            elementos[i] = null;
        }
        tope = -1;
    }

    // Indica si la pila está llena
    public boolean isFull() {
        return tope >= elementos.length - 1;
    }

    // Método para mostrar todos los elementos de la pila
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("(Texto vacío)");
        } else {
            for (int i = 0; i <= tope; i++) {
                System.out.println(elementos[i]);
            }
        }
    }
}

public class EditorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pila principal: guarda las líneas escritas
        Pila pilaPrincipal = new Pila(100);

        // Pila secundaria: guarda las líneas deshechas para poder rehacerlas
        Pila pilaSecundaria = new Pila(100);

        boolean salir = false;

        // Menú principal
        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            String opcionStr = sc.nextLine();
            int opcion;
            try {
                opcion = Integer.parseInt(opcionStr.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingresa un número entre 1 y 5.");
                continue;
            }

            switch (opcion) {
                case 1:
                    // Escribir texto y guardarlo en la pila principal
                    System.out.print("Escribe una línea de texto: ");
                    String linea = sc.nextLine();
                    pilaPrincipal.push(linea);

                    // Al escribir algo nuevo, se limpia la pila secundaria
                    pilaSecundaria = new Pila(100);
                    break;

                case 2:
                    // Deshacer: sacar de la pila principal y guardar en la secundaria
                    String deshecho = pilaPrincipal.pop();
                    if (deshecho != null) {
                        pilaSecundaria.push(deshecho);
                        System.out.println("Se deshizo: " + deshecho);
                    }
                    break;

                case 3:
                    // Rehacer: sacar de la pila secundaria y volver a la principal
                    String rehecho = pilaSecundaria.pop();
                    if (rehecho != null) {
                        pilaPrincipal.push(rehecho);
                        System.out.println("Se rehizo: " + rehecho);
                    }
                    break;

                case 4:
                    // Mostrar todo el texto actual
                    System.out.println("\nTexto actual:");
                    pilaPrincipal.mostrar();
                    break;

                case 5:
                    // Salir del programa
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}