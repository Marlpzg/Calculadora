package productos_concretos;

import productos_abstractos.Aritmetica;

public class Suma extends Aritmetica{

    @Override
    public String Operar(String a, String b) {
        try {
            double resultado = Double.parseDouble(a) + Double.parseDouble(b);
            return String.valueOf(resultado);
        }catch(NumberFormatException e){
            return "Ingrese números";
        }
    }

    @Override
    public String convertir(String valor) {
        return null;
    }
}
