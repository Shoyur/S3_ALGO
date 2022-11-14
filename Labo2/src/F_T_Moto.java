import java.util.Date;

public class F_T_Moto extends F_Terrestre {
    
    private boolean porteBagage;
    private int tempsCylindres;
    private String routeOuTerrain;

    public F_T_Moto(int numeroSerie, String fabricant, Date dateFabrication, String gasPneus, boolean attacheRemorque,
            double hauteurPassageLibreM, boolean porteBagage, int tempsCylindres, String routeOuTerrain) {
        super(numeroSerie, fabricant, dateFabrication, gasPneus, attacheRemorque, hauteurPassageLibreM);
        this.porteBagage = porteBagage;
        this.tempsCylindres = tempsCylindres;
        this.routeOuTerrain = routeOuTerrain;
    }

    public boolean isPorteBagage() {
        return porteBagage;
    }

    public void setPorteBagage(boolean porteBagage) {
        this.porteBagage = porteBagage;
    }

    public int getTempsCylindres() {
        return tempsCylindres;
    }

    public void setTempsCylindres(int tempsCylindres) {
        this.tempsCylindres = tempsCylindres;
    }

    public String getRouteOuTerrain() {
        return routeOuTerrain;
    }

    public void setRouteOuTerrain(String routeOuTerrain) {
        this.routeOuTerrain = routeOuTerrain;
    }

    @Override
    public String getGasPneus() {
        // TODO Auto-generated method stub
        return super.getGasPneus();
    }

    @Override
    public double getHauteurPassageLibreM() {
        // TODO Auto-generated method stub
        return super.getHauteurPassageLibreM();
    }

    @Override
    public boolean isAttacheRemorque() {
        // TODO Auto-generated method stub
        return super.isAttacheRemorque();
    }

    @Override
    public void setAttacheRemorque(boolean attacheRemorque) {
        // TODO Auto-generated method stub
        super.setAttacheRemorque(attacheRemorque);
    }

    @Override
    public void setGasPneus(String gasPneus) {
        // TODO Auto-generated method stub
        super.setGasPneus(gasPneus);
    }

    @Override
    public void setHauteurPassageLibreM(double hauteurPassageLibreM) {
        // TODO Auto-generated method stub
        super.setHauteurPassageLibreM(hauteurPassageLibreM);
    }

    @Override
    public Date getDateFabrication() {
        // TODO Auto-generated method stub
        return super.getDateFabrication();
    }

    @Override
    public String getFabricant() {
        // TODO Auto-generated method stub
        return super.getFabricant();
    }

    @Override
    public int getNumeroSerie() {
        // TODO Auto-generated method stub
        return super.getNumeroSerie();
    }

    @Override
    public void setDateFabrication(Date dateFabrication) {
        // TODO Auto-generated method stub
        super.setDateFabrication(dateFabrication);
    }

    @Override
    public void setFabricant(String fabricant) {
        // TODO Auto-generated method stub
        super.setFabricant(fabricant);
    }

    @Override
    public void setNumeroSerie(int numeroSerie) {
        // TODO Auto-generated method stub
        super.setNumeroSerie(numeroSerie);
    }
    
}
