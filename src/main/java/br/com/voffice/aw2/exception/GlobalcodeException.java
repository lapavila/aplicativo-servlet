package br.com.voffice.aw2.exception;

/**
 * @author Globalcode
 * 
 */
public class GlobalcodeException extends Exception {

    public GlobalcodeException(String mensagem, Exception e) {
        super(mensagem, e);
    }

    public GlobalcodeException(String mensagem) {
        super(mensagem);
    }
}
