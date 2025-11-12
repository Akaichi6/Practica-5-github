import java.time.LocalDateTime;
import java.util.Scanner;

public class parte5 {

    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce tu año de nacimiento:");
            int anyo = sc.nextInt();
            System.out.println("Intreduce tu mes de nacimiento");
            int dia = sc.nextInt();
            System.out.println("Introduce tu dia de nacimiento");
            int mes = sc.nextInt();
            LocalDateTime fechaActual = LocalDateTime.now();
            int edad = fechaActual.getYear()- anyo;
        System.out.printf("----------------------------------------\n");
            if(edad>18){
                System.out.println("Eres mayor de edad");
            }
            else{
                System.out.println("Eres menor de edad");
            }
        }

    }

