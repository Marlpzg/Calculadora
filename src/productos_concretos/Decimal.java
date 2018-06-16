package productos_concretos;

import productos_abstractos.Convertor;

public class Decimal extends Convertor{

    @Override
    public String convertir(String valor) {
        try {

            int potencia = valor.length()-1;
            int resultado = 0;
            for (int i = 0; i < valor.length(); i++){
                resultado += Math.pow(2,potencia)*Integer.parseInt(String.valueOf(valor.charAt(i)));
                potencia--;
            }
            return String.valueOf(resultado);

        }catch(NumberFormatException e){
            return "Ingrese números";
        }
    }
    
}
