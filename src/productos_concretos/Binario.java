package productos_concretos;

import productos_abstractos.Convertor;

public class Binario extends Convertor{

    @Override
    public String convertir(String valor) {
        int num, residuo;
        String resultado = "";
        try{
            num = Integer.parseInt(valor);
                
            do{
                residuo = num%2;
                resultado = residuo+resultado;
                num = num/2;
            }while(num != 0);

        }catch(NumberFormatException e){
            resultado = "Ingrese números";
        }
        
        return resultado;
    }
    
}
