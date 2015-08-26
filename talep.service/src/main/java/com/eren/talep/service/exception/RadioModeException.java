/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.bitirme.service.exception;

/**
 * Genel Exception SÄ±nÄ±fÄ±
 * @author firat
 */
public class RadioModeException extends RuntimeException {

    public RadioModeException(String msg) {
        super(msg);
    }

    public RadioModeException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
