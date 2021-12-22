package it.projectunivpm.demospringbootapp.controller;
import it.projectunivpm.demospringbootapp.filter.Filter;
import it.projectunivpm.demospringbootapp.model.*;
import it.projectunivpm.demospringbootapp.service.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageImpressions.ParsingPageImpressionDayImpl;
import it.projectunivpm.demospringbootapp.service.ParsingPageImpressions.ParsingPageImpressionWeekImpl;

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

	ConnectionTotalInsightImpl Connectionimpl = new ConnectionTotalInsightImpl();

	@RequestMapping(value = "/total_insight") 
	public ResponseEntity<Object> getTotalInsight() {
		Connectionimpl.saveData();
		return new ResponseEntity<>(InsightImpl.getInsightImpl(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{metric}/{period}") 
	public ResponseEntity<Insight> getFilteredInsight(@PathVariable String metric,@PathVariable String period) {
		Connectionimpl.saveData();
		return new ResponseEntity<>(Search.searchByMetricAndPeriod(metric, period), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{metric}") 
	public ResponseEntity<Object> getInsightByMetric(@PathVariable String metric) {
		Connectionimpl.saveData();
		return new ResponseEntity<>(Search.searchByMetric(metric), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/insight/{statistic}") 
	public ResponseEntity<Object> getStatistics(@PathVariable String statistic) {
		Connectionimpl.saveData();
		return new ResponseEntity<>(Search.searchStatsByName(statistic), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{metric}/{period}/{initialValue}/{finalValue}") 
	public ResponseEntity<Object> getFilteredStatistics(@PathVariable String metric, @PathVariable String period, @PathVariable long initialValue, @PathVariable long finalValue) {
		Connectionimpl.saveData();
		return new ResponseEntity<>(Filter.PageFilteredByMetricAndPeriod(Search.searchByMetricAndPeriod(metric, period), initialValue, finalValue), HttpStatus.OK);
	
	}
	
	@GetMapping(value = "/{metric}/{initialValue}/{finalValue}") 
	public ResponseEntity<Object> getFilteredStatistics(@PathVariable String metric, @PathVariable long initialValue, @PathVariable long finalValue) {
		Connectionimpl.saveData();
		return new ResponseEntity<>(Filter.PageFilteredByMetric(Search.searchByMetric(metric), initialValue, finalValue), HttpStatus.OK);
	
	}
	
}
