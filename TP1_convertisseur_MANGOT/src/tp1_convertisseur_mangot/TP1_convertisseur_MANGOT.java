/* MANGOT Manon
*TP1
*TDA2
*26 septembre 2023
 */
package tp1_convertisseur_mangot;

/**
 *
 * @author manon
 */
public class TP1_convertisseur_MANGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("\n Entrer une valeur réelle  :");
        double valeur = sc.nextDouble();
        System.out.println("voici la valeur donnée :" + valeur);
        System.out.println("Choisissez la conversion souhaitée :");
        System.out.println("1) Celsius vers Kelvin");
        System.out.println("2) Kelvin vers Celsius");
        System.out.println("3) Farenheit vers Celsius");
        System.out.println("4) Celsius vers Farenheit");
        System.out.println("5) Kelvin vers Farenheit");
        System.out.println("6) Farenheit vers Kelvin");
        int conv = sc.nextInt();
        if (conv>=6){
            System.out.println("Saisir une valeur entre 1 et 6");
        }
        if (conv == 1) {
            double a = CelsiusVersKelvin(valeur);
            System.out.println(valeur+" Celsius font "+a+"Kelvin");
        }
        if (conv == 2) {
            double b = KelvinVersCelsius(valeur);
            System.out.println(valeur+" Kelvin font "+b+"Celsius");
            
        }
        if (conv == 3) {
            double c = FarenheitVersCelsius(valeur);
            System.out.println(valeur+" Farenheit font "+c+"Kelvin");
        }
        if (conv==4){
        double d = CelsiusVersFarenheit(valeur);
        System.out.println(valeur+" Celsius font "+d+"Farenheit");
        }
        if (conv==5){
            double e=KelvinVersFarenheit(valeur);
                System.out.println(valeur+" Kelvin font "+e+" Farenheit");
        }
        if (conv==6){
            double f=FarenheitVersKelvin(valeur);
                    System.out.println(valeur+" Farenheit font "+f+"Kelvin");
        }
        
     

        // TODO code application logic here
    }

    public static double CelsiusVersKelvin(double tCelsius) {
        double tKelvin = tCelsius + 273.15;
        return tKelvin;
    }

    public static double KelvinVersCelsius(double tKelvin) {
        double tCelsius = tKelvin - 273.15;
        return tCelsius;
    }

    public static double FarenheitVersCelsius(double tFar) {
        double tCelsius = (tFar - 32) / 1.8;
        return tCelsius;
    }

    public static double CelsiusVersFarenheit(double tCelsius) {
        double tFar = (tCelsius * 1.8) + 32;
        return tFar;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double tFar = ((tKelvin - 273.15) * 1.8) + 32;
        return tFar;
    }

    public static double FarenheitVersKelvin(double tFar) {
        double tKelvin = ((tFar - 32) * 5.0 / 9) + 273.15;
        return tKelvin;
    }

}
