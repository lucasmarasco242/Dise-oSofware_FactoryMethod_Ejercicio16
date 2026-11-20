public class CreadorEnvioSucursal extends CreadorEnvio {
    public ServicioEnvio crearEnvio(String destino, double pesoKg, double distanciaKm) {
        if (destino == null || destino.isEmpty() || pesoKg <= 0) {
            System.out.println("Sucursal o peso inválido para Retiro en Sucursal.");
            return null;
        }
        return new RetiroSucursal();
    }
}