package lecturefichier;

import carte.Carte;
import java.io.File;


public class Lecturekml {
  private File fichierLecture;
  
  public Lecturekml(String directionFichier) {
    fichierLecture = new File(directionFichier);  
  }
  
  public Carte creerCarte() {
    return null;
  }
  
}
