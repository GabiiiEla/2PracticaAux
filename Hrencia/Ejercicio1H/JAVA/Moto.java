class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, anio, precioBase); 
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo de Motor: " + tipoMotor);
    }
}