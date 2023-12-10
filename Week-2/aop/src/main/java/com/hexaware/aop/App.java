package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.Service.BankService;
import com.hexware.aop.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	BankService service =		  context.getBean(BankService.class);    	
    	
    	
    			service.fundTransfer();
    			
    			//service.login();
    	
    			service.withdraw();
    			
    			//service.deposit();
    	
    		double balance =	service.getBalance(101);  
    	
    	
    		
    		System.out.println("Balance  "+balance);
    	
    }
}