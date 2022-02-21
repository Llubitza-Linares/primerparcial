package ejercicio2y3;

import java.time.LocalDateTime;

public class Registro {
    String message;

    public String roleUser(String user, String pwd) {
        if (RolesUsuario.isUserValid(user, pwd)) {
            message = "PERMISSION ROLE " + Permiso.getPermision(user, pwd) + " " + LocalDateTime.now();
        } else {
            message = "Incorrect USER and PWD";
        }

        return message;
    }
}
