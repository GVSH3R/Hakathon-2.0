package exceptions;

public class datosInvalidosException extends Exception{
    // Constructor
    public datosInvalidosException(String mensaje) {
        super(mensaje);
    }

    //Diana
    public static void validarNombre(String nombre) throws datosInvalidosException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new datosInvalidosException("El nombre no puede estar vacío, vuelve a intentarlo");
        }
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            throw new datosInvalidosException("El nombre solo debe contener letras, vuelve a intentarlo");
        }
    }









    //Leilani

        // Constructor
        public datosInvalidosException(String mensaje) {
            super(mensaje);


            if (apellido == null || apellido.trim().isEmpty()) {
                throw new datosInvalidosException("El apellido no puede estar vacío, vuelve a intentarlo");
            }
            if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                throw new datosInvalidosException("El apellido solo debe contener letras, vuelve a intentarlo");
            }


















    //Martin
    public static void validarTelefono(String tel) throws datosInvalidosException {
        tel = tel.replaceAll("[^\\d]", "");
        if (!tel.matches("\\d{10}")) {
            throw new datosInvalidosException("Número telefónico inválido");
        }
    }





}
