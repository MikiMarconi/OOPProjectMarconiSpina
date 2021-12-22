package it.projectunivpm.demospringbootapp.controller;
import it.projectunivpm.demospringbootapp.model.*;
import it.projectunivpm.demospringbootapp.service.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import it.projectunivpm.demospringbootapp.exceptions.MetricNotFoundException;
import it.projectunivpm.demospringbootapp.exceptions.MetricOrPeriodNotFoundException;
import it.projectunivpm.demospringbootapp.exceptions.StatisticNotFoundException;
import it.projectunivpm.demospringbootapp.filter.Filter;



@RestController
public class simpleRestController {

	ConnectionTotalInsightImpl Connectionimpl = new ConnectionTotalInsightImpl();

	@RequestMapping(value = "/insight") 
	public ResponseEntity<Object> getTotalInsight() {
		Connectionimpl.saveData();
		return new ResponseEntity<>(InsightImpl.getInsightImpl(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/insight/{metric}") 
	public ResponseEntity<Object> getInsightByMetric(@PathVariable String metric) {
		Connectionimpl.saveData();
		try {
			return new ResponseEntity<>(Search.searchByMetric(metric), HttpStatus.OK);
		} 
		catch (MetricNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/insight/stats/{statistic}") 
	public ResponseEntity<Object> getStatistics(@PathVariable String statistic) {
		Connectionimpl.saveData();
		try {
			return new ResponseEntity<>(Search.searchStatsByName(statistic), HttpStatus.OK);
		} catch (StatisticNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/insight/{metric}/{period}") 
	public ResponseEntity<Object> getFilteredInsight(@PathVariable String metric,@PathVariable String period) throws MetricOrPeriodNotFoundException {
		Connectionimpl.saveData();
		try {
			return new ResponseEntity<>(Search.searchByMetricAndPeriod(metric, period), HttpStatus.OK);
		} 
		catch (MetricOrPeriodNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(value = "/insight/{metric}/{period}/{initialValue}/{finalValue}") 
	public ResponseEntity<Object> getFilteredStatistics(@PathVariable String metric, @PathVariable String period, @PathVariable long initialValue, @PathVariable long finalValue) throws MetricOrPeriodNotFoundException {
		Connectionimpl.saveData();
		try {
			return new ResponseEntity<>(Filter.PageFilteredByMetricAndPeriod(Search.searchByMetricAndPeriod(metric, period), initialValue, finalValue), HttpStatus.OK);
		}
		catch (MetricOrPeriodNotFoundException e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/insight/{metric}/{initialValue}/{finalValue}") 
	public ResponseEntity<Object> getFilteredStatistics(@PathVariable String metric, @PathVariable long initialValue, @PathVariable long finalValue) {
		Connectionimpl.saveData();
		try {
			return new ResponseEntity<>(Filter.PageFilteredByMetric(Search.searchByMetric(metric), initialValue, finalValue), HttpStatus.OK);
		} catch (MetricNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	
	}
	
}
