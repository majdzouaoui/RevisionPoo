package encapsulatoin;

public class Test {

	public static void main(String[] args) {
Personne p = new Personne("majd" ,"zouaoui");
System.out.println("hello i'm "+p.getPrenom() + " " +p.getNom());
p.setNom("swisi");
System.out.println("hello i'm "+p.getPrenom() + " " +p.getNom());

	}

}
