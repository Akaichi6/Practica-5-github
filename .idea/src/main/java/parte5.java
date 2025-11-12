import java.time.LocalDateTime;
import java.util.Scanner;

public class parte5 {

    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce tu año de nacimiento:");
            int anyo = sc.nextInt();
            LocalDateTime fechaActual = LocalDateTime.now();
            int anyoactual = fechaActual.getYear();
            int edad = anyoactual - anyo;

            System.out.println("El año actual es: " + anyoactual);

            if(edad>18){
                System.out.println("Eres mayor de edad");
            }
            else{
                System.out.println("Eres menor de edad");
            }
        }

    }
