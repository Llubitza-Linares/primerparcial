package ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;

public class SalarioTest {
    @ParameterizedTest
    @CsvSource({
            "0,",
            "1,1",
            "2,2",

            "500,500",
            "501, 501",
            "502, 502",

            "1999,1999",
            "2000,2000",
            "2001, 2001",

    })

    public void descuentoSalario(int sueldo, int expectedResult)throws Exception{
        Salario salario=new Salario();

        if(sueldo<=0){
            Assertions.assertThrows(Exception.class, ()->salario.descuento(salario))
        }
    }
}
