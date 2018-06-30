/**
 * 
 */
package com.bancoazteca.bdm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoazteca.bdm.beans.Message;

/**
 * @author bruz-
 *
 */
@RestController
public class MessageController {

	//Esta asignacion es para cambios de variables en caliente
	//se le agrega
//	$ curl http://localhost:8080/env -d nombre=JAVIER
//	{"nombre":"JAVIER"}
//	$ curl http://localhost:8080/refresh -d helloworld
//	[]
//	$ curl http://localhost:8080/restart -d helloworld
//	{"message":"Restarting"}
//	$ curl http://localhost:8080/
//	{"message":"Hello JAVIER"}
	@Value("${nombre}")
	private String nombre;

	@RequestMapping("/")
	ResponseEntity<Message> home() {
		return new ResponseEntity<Message>(new Message("Hello" + nombre), HttpStatus.ACCEPTED);
	}
}
