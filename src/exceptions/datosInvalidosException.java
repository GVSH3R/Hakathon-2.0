package exceptions;

public class datosInvalidosException extends Exception{
    //Diana












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






}
