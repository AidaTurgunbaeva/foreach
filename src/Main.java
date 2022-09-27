import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sandar={1,2,3,4,5};
        for (int i = 0; i < sandar.length; i++) {
            System.out.print(sandar[i]+" ");
        }
        System.out.println();
        for (int a:sandar){
            System.out.print(a+" ");
        }
        System.out.println(); //бул сандарды кошуп коет
        int sum=0;
        for(int  a:sandar){
            sum+=a;
        }
        System.out.println(sum);

        String[]names={" Aida"," Anara"," Nurgul"};
        for (String a:names){
            System.out.println("Men seni jakshy korom"+a);
        }

        // ылдыйдагылар String дин методдору
        String soz="    Java    ";
        String name="Aida";
        System.out.println(name.charAt(1));
        System.out.println(name.substring(1));
        System.out.println(name.contains("a")); //берилген тамга барбы жокбу текшерет true or false
        System.out.println(name.toUpperCase()); //бардык созду чон кылып коет
        System.out.println(name.toLowerCase()); //бардык тамганы кичинекей кылып коет
        System.out.println(soz);
        System.out.println(soz.trim()); //боштуктарды алып коет
        System.out.println(name.equals(soz)); //создун окшоштугун карайт true or false кайтарат
        System.out.println(name);
        System.out.println(name.replace("d", "sh")); //создогу тамгаларды озгортот
        System.out.println(name.length()); //канча тамга экенин эсептеп чыгарат
        System.out.println(name.concat(" Turgunbaeva")); //созду берилген созго бириктирет
        System.out.println(name.indexOf("d")); //канчанчы тамга экенин корсотуп берет
            }
        }
