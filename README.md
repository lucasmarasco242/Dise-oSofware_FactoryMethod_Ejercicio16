Ejercicio 16 - Factoría de Métodos de Envío Logístico

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para calcular tarifas y plazos de envío mediante Correo Postal Tradicional, Envío Expreso Privado y Retiro en Sucursal, validando los datos de destino en cada factoría, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ServicioEnvio con el método cotizarEnvio(double pesoKg, double distanciaKm).
- Tres clases concretas (EnvioPostal, EnvioExpreso y RetiroSucursal) que calculan costo y tiempo estimado según cada modalidad.
- Una clase abstracta CreadorEnvio con el método de fábrica crearEnvio(String destino, double pesoKg, double distanciaKm).
- Tres clases creadoras concretas (CreadorEnvioPostal, CreadorEnvioExpreso y CreadorEnvioSucursal) que validan los requisitos y devuelven el servicio correspondiente.

Luego, dentro del método main, se prueban cotizaciones válidas para cada modalidad y un caso con destino inválido.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ServicioEnvio para devolver costo total y tiempo estimado.
- Validar los datos de destino y parámetros logísticos dentro de cada subclase creadora antes de instanciar el servicio.
- Encapsular las reglas de peso, distancia, recargos y plazos dentro de cada clase concreta de envío.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Correo Postal Tradicional -> Costo total: $2610.0 | Plazo estimado: 4 a 6 días hábiles
Envío Expreso Privado -> Costo total: $4020.0 | Plazo estimado: 24 a 48 horas
Retiro en Sucursal -> Costo total: $0.0 | Plazo estimado: Disponible en 2 horas
Datos inválidos para Envío Expreso (máx. 30 kg y destino/distancia válidos).
Envío descartado por destino inválido.

Captura de pantalla

<img width="825" height="259" alt="image" src="https://github.com/user-attachments/assets/27d01bb5-c59d-430c-b210-27d2bc1be7af" />
