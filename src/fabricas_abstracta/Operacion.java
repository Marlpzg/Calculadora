package fabricas_abstracta;

import productos_abstractos.Aritmetica;
import productos_abstractos.Convertor;

public interface Operacion {
    
    Convertor getOperacionC(String tipo);
    Aritmetica getOperacionA(String tipo);
    
}
