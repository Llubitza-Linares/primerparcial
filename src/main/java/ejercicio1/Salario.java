package ejercicio1;

public class Salario {
    public int descuento (int sueldo) throws Exception{
        if (sueldo > 0 && sueldo <= 2000){
            return sueldo;
        }else if(sueldo>2000 && sueldo<=4000){
            return (int)(sueldo*5/100);

        }else if(sueldo>4000){
            return (int)(sueldo*15/100);

        }else{
            throw new Exception("El sueldo ingresado es incorrecto!!");
        }
    }

}
