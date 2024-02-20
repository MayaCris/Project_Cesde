package apuntesdeclase;

public class metodoReturn {
    public static void main(String[] args) {
        //Llamo la variable
        calcularIva();
        //Imprimo la variable
        System.out.println(calcularIva());

        //asignar dentro de la variable local ivaCalculado el return de la función calcularIva()
        double ivaCalculado = calcularIva();
        System.out.println(ivaCalculado);

    }
    //Genera retorno cuando se pone un tipo primitivo de dato y no tiene el Void
    public static double calcularIva(){
        double  iva = 20000 * 0.19;
        return iva;
    }
}
