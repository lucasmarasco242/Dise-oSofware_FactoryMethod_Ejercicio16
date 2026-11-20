public class Main {
    public static void main(String[] args) {
        CreadorEnvio creadorPostal = new CreadorEnvioPostal();
        ServicioEnvio envio1 = creadorPostal.crearEnvio("5570", 2.5, 120.0);
        if (envio1 != null) {
            System.out.println(envio1.cotizarEnvio(2.5, 120.0));
        }

        CreadorEnvio creadorExpreso = new CreadorEnvioExpreso();
        ServicioEnvio envio2 = creadorExpreso.crearEnvio("Mendoza Centro", 1.2, 15.0);
        if (envio2 != null) {
            System.out.println(envio2.cotizarEnvio(1.2, 15.0));
        }

        CreadorEnvio creadorSucursal = new CreadorEnvioSucursal();
        ServicioEnvio envio3 = creadorSucursal.crearEnvio("Sucursal Palmira", 5.0, 0.0);
        if (envio3 != null) {
            System.out.println(envio3.cotizarEnvio(5.0, 0.0));
        }

        ServicioEnvio envioInvalido = creadorExpreso.crearEnvio("", 1.0, 10.0);
        if (envioInvalido == null) {
            System.out.println("Envío descartado por destino inválido.");
        }
    }
}