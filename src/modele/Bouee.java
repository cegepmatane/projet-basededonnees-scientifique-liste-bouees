package modele;

public class Bouee {
    private int idBouee;
    private int latitude;
    private int longitude;
    private int temperatureEau;
    private int temperatureAir;
    private float salinite;
    private float vitesseVent;
    private int dimension;
    private float pressionAtmospherique;

    
    
    public int getIdBouee() {
		return idBouee;
	}

	public void setIdBouee(int idBouee) {
		this.idBouee = idBouee;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getTemperatureEau() {
		return temperatureEau;
	}

	public void setTemperatureEau(int temperatureEau) {
		this.temperatureEau = temperatureEau;
	}

	public int getTemperatureAir() {
		return temperatureAir;
	}

	public void setTemperatureAir(int temperatureAir) {
		this.temperatureAir = temperatureAir;
	}

	public float getSalinite() {
		return salinite;
	}

	public void setSalinite(float salinite) {
		this.salinite = salinite;
	}

	public float getVitesseVent() {
		return vitesseVent;
	}

	public void setVitesseVent(float vitesseVent) {
		this.vitesseVent = vitesseVent;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public float getPressionAtmospherique() {
		return pressionAtmospherique;
	}

	public void setPressionAtmospherique(float pressionAtmospherique) {
		this.pressionAtmospherique = pressionAtmospherique;
	}

	public static int getCompteurIdBouee() {
		return compteurIdBouee;
	}

	public static void setCompteurIdBouee(int compteurIdBouee) {
		Bouee.compteurIdBouee = compteurIdBouee;
	}

	private static int compteurIdBouee;

    public Bouee(int latitude, int longitude, int temperatureEau, int temperatureAir, float salinite, float vitesseVent, int dimension, float pressionAtmospherique) {
        idBouee = compteurIdBouee++;
        this.latitude = latitude;
        this.longitude = longitude;
        this.temperatureEau = temperatureEau;
        this.temperatureAir = temperatureAir;
        this.salinite = salinite;
        this.vitesseVent = vitesseVent;
        this.dimension = dimension;
        this.pressionAtmospherique = pressionAtmospherique;
    }

    @Override
    public String toString() {
        return  "Bouee " + idBouee +
                ", lat=" + latitude +
                ", long=" + longitude +
                ", TE=" + temperatureEau +
                ", TA=" + temperatureAir +
                ", SAL=" + salinite +
                ", VV=" + vitesseVent +
                ", DD=" + dimension +
                ", PA=" + pressionAtmospherique +
                '}';
    }
}
