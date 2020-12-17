package org.example;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        for(int i=1;i<101;i++)
        {
            if(i%15==0)
            {
                logger.info("FizzBuzz");
            }
            else if(i%5==0)
            {
                logger.info("Buzz");
            }
            else if(i%3==0)
            {
                logger.info("Fizz");
            }

        }
    }
}
