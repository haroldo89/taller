/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Oswaldo
 */
public class DivisionCeroException extends Exception {

    public DivisionCeroException(String error_El_segundo_operador_es_0) {
        super(error_El_segundo_operador_es_0);
    }
    
}
