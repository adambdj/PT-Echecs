public class Test
{
  public static void main(String [] arg)
  {
    Echiquier e = new Echiquier();
    e.setCase(e.getCase(4,2),new Fou());
    System.out.println(e.afficher());
    try{
      System.out.println(e.getCase(4,2).getPiece().verifDeplacement(e,1,5));
    }catch(Exception ex){
      System.out.println(ex);
    }
  }

}
