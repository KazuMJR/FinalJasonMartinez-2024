import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el ejercicio que desea ejecutar.");
        System.out.println("[1] Mayor de tres numeros\n[2] Tabla de multiplicar\n[3] Calculadora\n[4] Determinar numero Primo");

        int opcion = sc.nextInt();
        int resultado = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese 3 numeros:");
                System.out.println("Ingrese el primer numero:");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero:");
                int num2 = sc.nextInt();
                System.out.println("Ingrese el tercer numero:");
                int num3 = sc.nextInt();

                ExamenFinalVarianteB resultadoFinal = new ExamenFinalVarianteB();

                resultado = resultadoFinal.MayorDeTres(num1, num2, num3);

                System.out.println("El numero mayor es :" + resultado);

                break;
                case 2:
                    System.out.println("Ingrese un numero:");
                    int tabla = sc.nextInt();

                    System.out.println("La tabla del numero seleccionado es:");
                    ExamenFinalVarianteB resultadofinal = new ExamenFinalVarianteB();

                    resultado = resultadofinal.Tabla(tabla);

                            System.out.println(resultado);

                    break;
                    case 3:
                        System.out.println("Ingrese dos numeros.");
                        System.out.println("Primer numero: ");
                        int numero1 = sc.nextInt();
                        System.out.println("Segundo numero: ");
                        int numero2 = sc.nextInt();

                        System.out.println("Ingrese la operacion a realizar");
                        System.out.println("[1] Suma\n[2] Resta\n[3] Multiplicacion\n[4] Division");
                        int operacion = sc.nextInt();

                        ExamenFinalVarianteB resultadoCalcu = new ExamenFinalVarianteB();

                        resultado = resultadoCalcu.Calculadora(numero1, numero2, operacion);

                        System.out.println(resultado);
                        break;
                        case 4:
                            System.out.println("Ingrese un numero:");
                                    int primo = sc.nextInt();

                                    ExamenFinalVarianteB resultadoPrimo = new ExamenFinalVarianteB();

                                    resultado = resultadoPrimo.Primo(primo);
                                    System.out.println(resultado);
                            break;
           
        }
    }
}