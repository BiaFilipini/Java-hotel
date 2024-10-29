package Hotel1;

public class Reserva {
    private String nomeHospede;
    private int numeroQuarto;
    private String dataCheckin;
    private String dataCheckout;
    private boolean ativa;

    
    public Reserva(String nomeHospede, int numeroQuarto, String dataCheckin, String dataCheckout) {
        this.nomeHospede = nomeHospede;
        this.numeroQuarto = numeroQuarto;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.ativa = true; 
    }


    public String getNomeHospede() { return nomeHospede; }
    public int getNumeroQuarto() { return numeroQuarto; }
    public boolean isAtiva() { return ativa; }

  
    public void cancelar() { 
        this.ativa = false; 
    }

    
    @Override
    public String toString() {
        return "Reserva de " + nomeHospede + 
               " - Quarto: " + numeroQuarto +
               " - Check-in: " + dataCheckin + 
               " - Check-out: " + dataCheckout + 
               " - " + (ativa ? "Ativa" : "Encerrada");
    }
}
