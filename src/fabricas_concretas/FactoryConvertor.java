package fabricas_concretas;

import fabricas_abstracta.Operacion;
import productos_abstractos.*;
import productos_concretos.*;

public class FactoryConvertor implements Operacion{

    @Override
    public Convertor getOperacionC(String tipo) {
        switch(tipo){
            case "bin":
                return new Binario();
            case "dec":
                return new Decimal();
            case "oct":
                return new Octal();
        }
        return null;
    }


    @Override
    public Aritmetica getOperacionA(String tipo) {
        return null;
    }
}
