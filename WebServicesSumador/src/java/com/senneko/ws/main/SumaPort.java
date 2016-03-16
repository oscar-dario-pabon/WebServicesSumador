/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senneko.ws.main;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * Puerto sumador
 *
 * @author Oscar Pabon
 */
@WebService(serviceName = "SumaPort")
public class SumaPort {

    /**
     * Suma 2 numeros
     * 
     * @param a parametro a
     * @param b parametro b
     * @return suma de los parametros
     */
    @WebMethod(operationName = "sumar")
    public String sumar(@WebParam(name = "parametro_a") int a, @WebParam(name = "parametro_b") int b) {
        return "" + (a + b);    
    }
}
