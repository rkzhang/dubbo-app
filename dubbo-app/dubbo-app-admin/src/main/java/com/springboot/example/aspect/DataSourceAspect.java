package com.springboot.example.aspect;

import org.apache.commons.lang.time.StopWatch;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

	protected static final Log logger = LogFactory.getLog(DataSourceAspect.class);
	
	@Around("execution(* com.springboot..mapper.*.*(..))")
	public Object watchPerformance(ProceedingJoinPoint jpoind){
		StopWatch watch = new StopWatch();
		watch.start();
		Object retVal = null;
		try {
			retVal = jpoind.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		watch.stop();
		long longtime = watch.getTime();  
		long second = longtime/1000;
        String time = String.format("%02d:%02d:%02d:%02d:%d", second/3600, second/60, second%60, second, longtime);   
        logger.info(" *** " + jpoind.getTarget().toString() + " spended time is : " + time);
        return retVal;
	}
}
