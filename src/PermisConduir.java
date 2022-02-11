import java.util.Scanner;

public class PermisConduir
{
    // 2. Crea una classe PermisConduir que tingui els atributs nom, tipusPermis i punts, i els corresponents
// mètodes set i get per a cada un d'ells.
//
//Afegeix un mètode anomenat imprimirPermis que imprimeixi per pantalla tots els atributs.
//
//Afegeix un mètode anomenat restarPunts que resti del total de punts del permís el número de punts que rebi com a
// paràmetre.
//


    static Scanner sc = new Scanner(System.in);

    private String nom;
    private String tipusPermis;
    private int punts;

    public String getTipusPermis() {
        return tipusPermis;
    }

    public int getPunts() {
        return punts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public void setTipusPermis(String tipusPermis) {
        this.tipusPermis = tipusPermis;
    }




    public  void restarPunts(int punts)
    {
        System.out.println("Introduzca los puntos a restar del permiso de conducir: ");

        int puntosARestar = sc.nextInt();

        this.punts = punts - puntosARestar;

        System.out.println("Se han restado " + puntosARestar + " puntos.");

        System.out.println("A este permiso de conducir le quedan " + punts + " puntos.");


    }


    public void imprimirPermis(String nom, String tipus, int punts)
    {
        System.out.println("---------------------");
        System.out.println("PERMISO DE CONDUCIR: ");
        System.out.println("Nombre: " + nom);
        System.out.println("Tipo de permiso: " + tipus);
        System.out.println("Puntos del permiso: " + punts);
        System.out.println("---------------------");

    }

}






