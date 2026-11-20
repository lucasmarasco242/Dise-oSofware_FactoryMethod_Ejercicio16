public class CreadorEnvioPostal extends CreadorEnvio {
    public ServicioEnvio crearEnvio(String destino, double pesoKg, double distanciaKm) {
        if (destino == null || destino.isEmpty() || pesoKg <= 0 || distanciaKm < 0) {
            System.out.println("Datos de destino o peso inválidos para Correo Postal.");
            return null;
        }
        return new EnvioPostal();
    }
}