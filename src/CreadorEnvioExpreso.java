public class CreadorEnvioExpreso extends CreadorEnvio {
    public ServicioEnvio crearEnvio(String destino, double pesoKg, double distanciaKm) {
        if (destino == null || destino.isEmpty() || pesoKg <= 0 || pesoKg > 30.0 || distanciaKm <= 0) {
            System.out.println("Datos inválidos para Envío Expreso (máx. 30 kg y destino/distancia válidos).");
            return null;
        }
        return new EnvioExpreso();
    }
}