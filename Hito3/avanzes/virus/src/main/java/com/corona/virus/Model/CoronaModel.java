
package com.corona.virus.Model;
import org.springframework.stereotype.Repository;

@Repository
public class CoronaModel implements CoronaModelService {

    @Override
    public void LEER(String dept, int cc, int cs) {
        System.out.println("Datos ingresados: " + dept + cc + cs);
    }

    @Override
    public void Mostrar() {
        System.out.println("Mostrar");
    }
}