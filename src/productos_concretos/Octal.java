package productos_concretos;

import productos_abstractos.Convertor;

public class Octal extends Convertor{

    @Override
    public String convertir(String valor) {
        int num, residuo;
        String resultado = "";
        try{
            num = Integer.parseInt(valor);

            do{
                residuo = num%8;
                resultado = residuo+resultado;
                num = num/8;
            }while(num != 0);

        }catch(NumberFormatException e){
            resultado = "Ingrese números";
        }

        return resultado;
    }
    
}
