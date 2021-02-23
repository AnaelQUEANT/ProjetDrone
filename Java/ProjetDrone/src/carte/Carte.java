package carte;

import java.util.ArrayList;
import polygone.Polygone;

public class Carte {
  private Polygone lePolygoneDeRecherche;
  private ArrayList<Polygone> lesPolygonesInterdits;
  
  public Carte(Polygone lePolygoneDeRecherche) {
    this.lePolygoneDeRecherche = lePolygoneDeRecherche;
    lesPolygonesInterdits = new ArrayList<Polygone>();
  }
  
  public void ajoutPolygoneInterdit(Polygone unPolygoneInterdit) {
    lesPolygonesInterdits.add(unPolygoneInterdit);
  }
  
  public Polygone getPolygoneRecherche() {
    return lePolygoneDeRecherche;
  }
}
