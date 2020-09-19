package com.dxc.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PersonAspect {

	
	@Before("execution(String getName())")
	public void getNameAdvice() {
		System.out.println("advice before getterr");
	}

	@Before("execution(* get*())")
	public void getIdAdvice() {
		System.out.println("advice before getter with wildcard character");
	}
	
	@Before("setNamePointcut()")
	public void setAdvice() {
		System.out.println("first advice before setter method");
	}
	
	@Before("execution(public void set*(String))")
	public void setSecondAdvice() {
		System.out.println("second advice before setter method");
	}
	
	@Before("execution(public void set*(String))")
	public void setThirdAdvice() {
		System.out.println("third advice before setter method");
	}
	
	@Pointcut("execution(public void set*(String))")
	public void setNamepointcut() {}
	//demmy method,
	//Pointcut declaration 
	//this pointcut is to be applied for different join points.
	
	@Pointcut("within(com.dxc.model.*)")
	public void allMethodsPointcut() {}
	
		
}