package fabricas_concretas;

import fabricas_abstracta.Operacion;
import productos_abstractos.*;
import productos_concretos.*;

public class FactoryAritmetica implements Operacion{

    @Override
    public Convertor getOperacionC(String tipo) {
        return null;
    }

    @Override
    public Aritmetica getOperacionA(String tipo) {
        switch (tipo){
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "mult":
                return new Multiplicacion();
            case "div":
                return new Division();
        }

        return null;
    }
    
}
