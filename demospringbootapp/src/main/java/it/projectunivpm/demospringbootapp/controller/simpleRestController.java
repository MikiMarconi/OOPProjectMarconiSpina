package it.projectunivpm.demospringbootapp.controller;
import it.projectunivpm.demospringbootapp.model.*;
import it.projectunivpm.demospringbootapp.service.*;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class simpleRestController {


	ConnectionImpl Connectionimpl = new ConnectionImpl();

	@RequestMapping(value = "/page_consumptions") 
	public ResponseEntity<Object> getInsightImpl() {
		Connectionimpl.saveData();
		return new ResponseEntity<>(InsightImpl.getInsightImpl(), HttpStatus.OK);
	}

	/* 
	 * Il numero di volte in cui le persone hanno cliccato su uno dei tuoi contenuti
	 */

	/*
	 * @GetMapping("/page_consumptions")
	 */

	/* 
	 * Il numero di volte in cui un contenuto della tua Pagina o relativo alla
	 * tua Pagina e' apparso nello schermo di una persona. Sono inclusi i post, 
	 * le storie, le inserzioni e altri contenuti o informazioni presenti sulla tua Pagina.
	 */

	/*
	 * @GetMapping("/page_impressions")
	 */

	/* 
	 * Il numero di nuove persone a cui piace la tua Pagina.
	 */

	/*
	 * @GetMapping("/page_fan_adds_unique")
	 */	
}
