package e1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
@Aspect
public class MyAspect {

    @Before(value = "execution(public void e1.BookService.show(..))")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("切面方法的前置");
    }

    @AfterReturning(value = "pointCut()",returning = "obj")
    public void after(Object obj){
        System.out.println("切面方法的后置");
    }

    @Pointcut(value = "execution(* * ..*.*(..))")
    public void pointCut(){}
}
