/**
*
*/
package UT3_clase3;



import java.util.Scanner;



/**
* @author Ismael
*
*/
public class EJERCICIO36 {​​​​



/**
* @param args
*/
public static void main(String[] args) {​​​​
// TODO Auto-generated method stub



Scanner entrada = new Scanner(System.in);

int filas=0;

System.out.println("Introduce número de filas");
filas = entrada.nextInt();

for (int i = 0; i < filas; i++) {​​​​
for(int j = 1; j <= filas; j++) {​​​​
System.out.print(" * ");
}​​​​
System.out.print("\n");
}​​​​
}​​​​
}​​​​
