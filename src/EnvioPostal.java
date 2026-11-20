public class EnvioPostal implements ServicioEnvio {
    public String cotizarEnvio(double pesoKg, double distanciaKm) {
        double costo = 1200.0 + (pesoKg * 180.0) + (distanciaKm * 8.0);
        return "Correo Postal Tradicional -> Costo total: $" + costo + " | Plazo estimado: 4 a 6 días hábiles";
    }
}