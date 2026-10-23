

import java.util.Scanner;
class reto_002 {
    public static void main(String[] args) {
        
        
        int debepagar;
        int paga;
        int cambio= 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor que debe pagar: ");
        debepagar = scanner.nextInt();
        

        System.out.println("Ingrese el valor que paga: ");
        paga = scanner.nextInt();
        
        scanner.close();
        
        String errorMessage = "El valor que paga es menor al valor que debe pagar";

        cambio = (paga >= debepagar) ? paga - debepagar : Integer.parseInt(errorMessage);
        
        int a = cambio/100; 
        int b = (cambio-a*100)/50; 
        int c = (cambio-a*100-b*50)/20; 
        int d = (cambio-a*100-b*50-c*20)/10; 
        int e = (cambio-a*100-b*50-c*20-d*10)/5;  
        int f = (cambio-a*100-b*50-c*20-d*10-e*5)/2; 
        int g = (cambio-a*100-b*50-c*20-d*10-e*5-f*2)/1; 
          
                
            String mensaje = "billete(s) de : " ;
            String mensaje2 = "moneda(s) de : " ;
            
        System.out.println(cambio + " euros de cambio");
        System.out.println(mensaje + a + " de 100 euros");
        System.out.println(mensaje + b + " de 50 euros");
        System.out.println(mensaje + c + " de 20 euros");
        System.out.println(mensaje + d + " de 10 euros");
        System.out.println(mensaje + e + " de 5 euros");
        System.out.println(mensaje2 + f + " de 2 euros");
        System.out.println(mensaje2 + g + " de 1 euro");
        
        
        

    }
}
