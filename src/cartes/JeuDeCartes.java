package cartes;


public class JeuDeCartes {
	
	private Configuration[] typesDeCartes = new Configuration[19] ;
	
	public JeuDeCartes() {
		typesDeCartes[0] = new Configuration(new Borne(25), 10);
		typesDeCartes[1] = new Configuration(new Borne(50), 10);
		typesDeCartes[2] = new Configuration(new Borne(75), 10);
		typesDeCartes[3] = new Configuration(new Borne(100), 12);
		typesDeCartes[4] = new Configuration(new Borne(200), 4);
		
		typesDeCartes[5] = new Configuration(new Parade(Type.FEU), 14);
		typesDeCartes[6] = new Configuration(new FinLimite(), 6);
		typesDeCartes[7] = new Configuration(new Parade(Type.CREVAISON), 6);
		
		/*TODO : finir de mettre les cartes dans l'ordre*/
	}

	public String affichageJeuDeCartes() {
		/*TODO : afficher toutes les cartes */
		return "";
	}
	
	public Carte[] donnerCartes() {
		/*TODO : donner un tableau de carte */
		for (typesDeCartes c : )
		return 
	}
	
	private class Configuration extends Carte{
		private int nbExemplaires;
		private Carte carte;

		public Configuration(Carte carte, int nbExemplaires) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
		}

		public int getNbExemplaires() {
			return nbExemplaires;
		}

		public Carte getCarte() {
			return carte;
		}
		
	}

}
