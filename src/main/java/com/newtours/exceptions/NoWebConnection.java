package com.newtours.exceptions;

public class NoWebConnection extends RuntimeException  {
	
	/**
	 * Excepcion para cuando no hay conexion con la web
	 */
	private static final long serialVersionUID = 1L;

	public NoWebConnection(String actorName) {
        super("The actor can´t browse the web");
    }

}
