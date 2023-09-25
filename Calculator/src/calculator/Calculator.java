/* MANGOT Manon
*TP0
*TDA2
*25 septembre 2023
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author manon
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
System.out.println("Please enter the operator:");
System.out.println("1) add");
System.out.println("2) substract");
System.out.println("3) multiply");
System.out.println("4) divide");
System.out.println("5) modulo");
      
var sc = new Scanner (System.in);
System.out.println("\n Entrer le nombre:");
int operateur=sc.nextInt(); 


System.out.println("\n Entrer une première valeur:");
int operande1=sc.nextInt(); 

System.out.println("\n Entrer une seconde valeur:");
int operande2=sc.nextInt();
int result=0;
if (operateur==1)
  result=operande1+operande2;
if (operateur==2)
  result=operande1-operande2;
if (operateur==3)
  result=operande1*operande2;
if (operateur==4)
  result=operande1/operande2;
if (operateur==5)
  result=operande1%operande2;
if (1)

System.out.println("Le resultat est "+result);

    }
    
    
}

