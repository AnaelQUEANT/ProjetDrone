package polygone;


public class Polygone {
  private Sommet sommet;
  
  public Polygone(Sommet unSommet) {
    this.sommet = unSommet;
  }
  
  public Sommet getSommet() {
    return this.sommet;
  }
}
