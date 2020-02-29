package pracownia.introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    final static Logger log;

    static {
        log = Logger.getLogger(HelloWorld.class);
    }

    public static void main(String [ ] args) {


        System.out.println("Hello World");
        log.info("message");

    }
}