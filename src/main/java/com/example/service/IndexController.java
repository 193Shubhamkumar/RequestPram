package com.example.service;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController {
  @RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)
  //String getDynamicUriValue(@RequestParam("id") String id,@RequestParam("time") int time){
  String getDynamicUriValue(@PathVariable("id") String id,@RequestParam("time") int time){
   
//	  Date startDate=new Date();
	  try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		System.out.println("Exception in sleep :"+e);
	}
//	  Date endDate=new Date();
	System.out.println("ID is "+id);
    System.out.println("time is "+time);
//    long totalTime=endDate.getTime()-startDate.getTime();
//    System.out.println("Total time taken by process "+totalTime);
    
    return "Dynamic URI parameter fetched"; 
  } 
  
  @RequestMapping(value = "/fetch/{id:[a-z]+}/{name}", method = RequestMethod.GET)
    String getDynamicUriValueRegex(@PathVariable("name") String name, @RequestParam("time") long time) {
	  
//	  Date  startDate = new Date();
	  try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("Exception in sleep :"+e);
		}
    System.out.println("Name is "+name);
    System.out.println("time is" +time);
//    Date endDate=new Date();
//    long totalTime1=endDate.getTime()-startDate.getTime();
//    System.out.println("Total time taken by process "+totalTime1);
    
    return "Dynamic URI parameter fetched using regex"; 
  } 
}