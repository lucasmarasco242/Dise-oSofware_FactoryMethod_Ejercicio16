public class EnvioExpreso implements ServicioEnvio {
    public String cotizarEnvio(double pesoKg, double distanciaKm) {
        double costo = 2500.0 + (pesoKg * 350.0) + (distanciaKm * 20.0) + 800.0;
        return "Envío Expreso Privado -> Costo total: $" + costo + " | Plazo estimado: 24 a 48 horas";
    }
}