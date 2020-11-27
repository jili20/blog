package com.bing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 日志处理类
 *
 * @author bing  @create 2020/11/27-上午10:01
 */
//@Aspect
//@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 定义切面
    @Pointcut("execution(* com.bing.web.*.*(..))")
    public void log() {
    }

    // 切面方法之前执行
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        RequestLog requestLog = new RequestLog(url, ip, classMethod, args);

//      logger.info("*************  doBefore ************");
        logger.info("Request : {}", requestLog);
        // Request : RequestLog{url='http://blog.com/3/aaa', ip='127.0.0.1', classMethod='com.bing.web.IndexController.index', args=[3, aaa]}
    }

    // 切面方法执行之后执行
    @After("log()")
    public void doAfter() {
        logger.info("******** doAfter ********");
    }

    // 返回的内容
    @AfterReturning(returning = "result", pointcut = "log()")
    public void doAfterRuturn(Object result) {
        logger.info("Result : {}", result);
    }

    private class RequestLog {
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;

        public RequestLog(String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "RequestLog{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }

}
