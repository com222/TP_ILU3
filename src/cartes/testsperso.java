package cartes;

public class testsperso {
	public static void main(String[] args) {
		Botte botte = new Botte(Type.ACCIDENT);
		Borne borne = new Borne(25);
		DebutLimite debutlimite = new DebutLimite();
		System.out.println(botte);
		System.out.println(borne);
		System.out.println(debutlimite);
	}
}
