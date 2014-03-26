package com.stepinfo.stepcamp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AuditMethode {

    private final static Logger LOGGER = LoggerFactory.getLogger(AuditMethode.class);

    @Around("execution(* com.stepinfo.stepcamp.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("### TEST ASPECTJ ###");
        String namePjp = pjp.getSignature().getName();
        LOGGER.info("### DEBUT de la méthode " + namePjp + " sur l'objet " + pjp.getTarget().toString());
        Object resultat = pjp.proceed();
        LOGGER.info("### FIN de la méthode " + namePjp + " avec comme résultat " + resultat);
        return resultat;
    }
}