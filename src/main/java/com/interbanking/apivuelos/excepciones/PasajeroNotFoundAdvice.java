package com.interbanking.apivuelos.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PasajeroNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(PasajeroNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String pasajeroNotFoundHandler(PasajeroNotFoundException ex){
        return  ex.getMessage();
    }
}