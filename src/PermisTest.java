import java.util.Scanner;

public class PermisTest
{
// 2. Crea una classe PermisConduir que tingui els atributs nom, tipusPermis i punts, i els corresponents
// mètodes set i get per a cada un d'ells.
//
//Afegeix un mètode anomenat imprimirPermis que imprimeixi per pantalla tots els atributs.
//
//Afegeix un mètode anomenat restarPunts que resti del total de punts del permís el número de punts que rebi com a
// paràmetre.
//


//Crea una altra classe PermisTest amb un main on es creïn 2 objectes de tipus PermisConduir i es provin
// els seus mètodes set, imprimirPermis i restarPunts.

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args)
    {

        PermisConduir permis1 = new PermisConduir();

        System.out.println("Permiso de Conducir 1: ");
        System.out.println("" +
                "");


        System.out.println("Introduce el Nombre: ");
        permis1.setNom(sc.next());

        System.out.println("Introduce el tipo de Permiso: ");
        permis1.setTipusPermis(sc.next());

        System.out.println("Introduce los Puntos del Permiso: ");
        permis1.setPunts(sc.nextInt());


        System.out.println("" +
                "");
        permis1.imprimirPermis(permis1.getNom(), permis1.getTipusPermis(), permis1.getPunts());

        System.out.println("INFRACCIÓN: RESTA DE PUNTOS!");

        permis1.restarPunts(permis1.getPunts());

        permis1.imprimirPermis(permis1.getNom(), permis1.getTipusPermis(),permis1.getPunts());





    }




}

