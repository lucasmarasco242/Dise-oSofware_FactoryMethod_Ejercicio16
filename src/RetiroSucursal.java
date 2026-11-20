public class RetiroSucursal implements ServicioEnvio {
    public String cotizarEnvio(double pesoKg, double distanciaKm) {
        double costo = pesoKg > 20.0 ? 500.0 : 0.0;
        return "Retiro en Sucursal -> Costo total: $" + costo + " | Plazo estimado: Disponible en 2 horas";
    }
}