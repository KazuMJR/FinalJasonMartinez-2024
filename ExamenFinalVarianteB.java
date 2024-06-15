public class ExamenFinalVarianteB {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int Tabla;
    private int operacion;

    public ExamenFinalVarianteB() {

    }


    //Metodos

    public int MayorDeTres (int num1, int num2, int num3){
        int resultado = 0;
        if(num1 > num2 && num1 > num3){
            resultado = num1;
        }
        else if(num2 > num1 && num2 > num3){
            resultado = num2;
        }
        else if(num3 > num1 && num3 > num2){
            resultado = num3;
        }
        return resultado;
    }

    public int Tabla (int Tabla){
        int resultado = 0;
        for(int i = 1; i <= 10; i++){
            resultado = Tabla*i;
            System.out.println(Tabla + "*" + i + " = " + resultado);
        }
        return resultado;
    }

    public int Calculadora (int num4, int num5, int operacion){
        int resultado = 0;

        if(operacion == 1){
            resultado = num4 + num5;
            System.out.println(num4 + "+" + num5 + " = " + resultado);
        }
        else if(operacion == 2){
            resultado = num4 - num5;
            System.out.println(num4 + "-" + num5 + " = " + resultado);
        }
        else if(operacion == 3){
            resultado = num4 * num5;
            System.out.println(num4 + "*" + num5 + " = " + resultado);
        }
        else if(operacion == 4){
            resultado = num4 / num5;
            System.out.println(num4 + "/" + num5 + " = " + resultado);
        }
        else{
            System.out.println("Error al seleccionar el operador");
        }
        return resultado;
    }

    public int Primo(int num6){
        int resultado = 0;
        boolean primo =true;

        for(int i=2; i<num6; i++){
            if(num6%i == 0) primo = false;

        }

        if(primo == true){
            System.out.println("El numero: " + num6 + " es Primo");
        }
        else{
            System.out.println("El numero: " + num6 + " no es primo");
        }
        return resultado;
    }
}




