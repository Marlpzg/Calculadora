package fabricas_concretas;

import fabricas_abstracta.Operacion;

public class FactoryFabricas {

    public static Operacion getFabrica(String tipo){
        switch (tipo){
            case "C":
                return new FactoryConvertor();
            case "A":
                return new FactoryAritmetica();
        }

        return null;
    }

}
