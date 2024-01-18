package AOP_Demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-26 16:23
 * @LastEditTime: 2023-06-26 16:23
 */
@Aspect
//@Component
public class PerformanceLogAspect {
    @Around("@annotation(PerformanceLog)")
    public Object logPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法 " + methodName + " 执行 " + executionTime + "ms");
        return result;
    }
}
