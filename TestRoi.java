public class TestRoi
{
  public static void main(String[] args) {
    Echiquier e = new Echiquier();
    Case d = e.getCase(5,3);
    Case a = e.getCase(4,3);
    e.setCase(d, new Roi(5,3,0));
    e.setCase(a, new Pion(3,3,0));
    System.out.println(d.getPiece().verifDeplacement(e,a));
//    d.getPiece().deplacerPieces(e,a);
    System.out.println(e.afficher());
  }

}
