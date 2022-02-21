package ejercicio2y3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.time.LocalDateTime;

public class RolesUsuarioTest {
    @BeforeAll
    public static void before(){
        MockedStatic<Permiso> objetoMock = Mockito.mockStatic(Permiso.class);
        MockedStatic<RolesUsuario> objetoMock2 = Mockito.mockStatic(RolesUsuario.class);
        objetoMock.when(()->Permiso.getPermision("admin","password")).thenReturn("CRUD");
        objetoMock2.when(()->RolesUsuario.isUserValid("admin","password")).thenReturn(true);
    }

    @Test
    public void verify_role(){
        Registro registro = new Registro();
        String expected = "PERMISSION ROLE CRUD" + " " + LocalDateTime.now();
        String actual = registro.roleUser("admin","password");

        Boolean resul = expected.contains(actual);
        System.out.println(resul);
        Assertions.assertTrue(resul);
    }


    @Test
    public void verify_role_incorrect(){
        Registro registro = new Registro();
        String expected = "Usuario y password incorrecto";
        String actual = registro.roleUser("Juan Perez","123456");

        Assertions.assertEquals(expected,actual,"Error");
    }

}
