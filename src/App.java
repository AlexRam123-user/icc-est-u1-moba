import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mo = new MetodoOrdenamiento();
        //int[] arr= {5,8,9,0};
        //int[] arr={1,2,3,4,5};
        //mo.sortBubbleAva(arr);
        //mo.printArreglo(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamanio: ");
        int tamanio=sc.nextInt();

        do {
            System.out.println("Ingrese el tamanio que sea entero positivo");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Ingrese un numero entero positivo");
                System.out.println("Ingrese el tamanio que sea entero positivo");
                sc.next();
            }
            tamanio = sc.nextInt();
            if(tamanio <= 0){
                System.out.println("El tamanio debe ser entero Positivo ");
            }
        }while (tamanio <= 0);

        int[]arreglo = new int[tamanio];

        System.out.println("Arreglo: "+arreglo);
        sc.close();
    }
}
