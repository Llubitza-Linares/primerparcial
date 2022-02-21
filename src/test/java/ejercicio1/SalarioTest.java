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

    public void descuentoTest(int s,int expectedResult) throws Exception {
        Salario salario = new Salario();

        if(s<=0) {
            Assertions.assertThrows(Exception.class, ()-> {salario.descuento(s);} );
        }else {
            int actualResult = salario.descuento(s);
            Assertions.assertEquals(expectedResult,actualResult,"ERROR! El descuento es incorrecto");
        }


    }
}
