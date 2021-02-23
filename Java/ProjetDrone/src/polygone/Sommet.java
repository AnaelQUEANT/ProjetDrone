package polygone;

public class Sommet {
  private double coordonneeX;
  private double coordonneeY;
  private Sommet sommetSuivant;

  /**
   * Cr�ation d'un sommet qui va servir pour le Polygone. Ce sommet est d�finis par 2 coordonn�es
     Le syst�me qui permet de connaitre les voisins des sommets et une liste chain�. 

   * @param x Coordonn�es sur l'axe Horizontale.
   * @param y Coordonn�es sur l'axe verticale.
   */
  public Sommet(double x, double y) {
    this.setCoordonneeX(x);
    this.setCoordonneeY(y);
    sommetSuivant = null;
  }

  public double getCoordonneeX() {
    return coordonneeX;
  }

  public void setCoordonneeX(double coordonneeX) {
    this.coordonneeX = coordonneeX;
  }

  public double getCoordonneeY() {
    return coordonneeY;
  }

  public void setCoordonneeY(double coordonneeY) {
    this.coordonneeY = coordonneeY;
  }

  public void ajouterSommetSuivant(Sommet sommetSuivant) {
    this.sommetSuivant = sommetSuivant;
  }

  public void ajouterSommetSuivant(double x, double y) {
    sommetSuivant = new Sommet(x, y);
  }

  public Sommet getSommetSuivant() {
    return this.sommetSuivant;
  }

}
