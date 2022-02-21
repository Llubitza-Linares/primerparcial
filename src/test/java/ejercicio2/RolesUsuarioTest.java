package ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RolesUsuarioTest {
    @ParameterizedTest
    @CsvSource({
            "Juan Perez",
            "Adriana Flores",
            "Manuel Vargas,"
    })

    public void verifyRolesUsuario()
}
