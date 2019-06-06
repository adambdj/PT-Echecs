public class Test
{
  public static void main(String [] arg)
  {
    Echiquier e = new Echiquier();

    System.out.println(e.afficher());
    try
    {
      e.getCase(7,2).getPiece().verifDeplacement(e,1,5);
    }
    
    catch(Exception ex)
    {
      System.out.println(ex);
    }
  }

}
