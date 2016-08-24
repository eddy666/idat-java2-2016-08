package com.idat.boot.claseuno.semanauno.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Planilla {
	
	@RequestMapping("/planillas")
	public String getPlanillas(){
		return "Solicitando planillas.";
	}
	
    @RequestMapping("/planillabyrequestparam")
    public String planillaByRequestParam(@RequestParam(value="name", required=false, defaultValue="Idat") String name) {
        return "Solicitando planilla por planillabyrequestparam para "+name;
    }
    
    @RequestMapping(value="/planillabypathvariable/{name}", method = RequestMethod.GET)
    public String planillaByPathVariable(@PathVariable("name") String name) {
        return "Solicitando planilla por planillabypathvariable para "+name;
    }    
}