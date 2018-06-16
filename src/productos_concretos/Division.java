package productos_concretos;

import productos_abstractos.Aritmetica;

public class Division extends Aritmetica{

    @Override
    public String Operar(String a, String b) {
        try {
            if (Double.parseDouble(b) != 0.0) {
                double resultado = Double.parseDouble(a) / Double.parseDouble(b);
                return String.valueOf(resultado);
            } else {
                return "Indefinido";
            }
        }catch(NumberFormatException e){
        return "Ingrese números";
        }
    }

    @Override
    public String convertir(String valor) {
        return null;
    }
}
