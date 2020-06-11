package com.dcpuz.spring.servera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *  server a main
 * </p>
 *
 * @author dengc
 * @since 2020/6/11
 */
@SpringBootApplication
public class ServerAApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(ServerAApplication.class,args);
    }
}
