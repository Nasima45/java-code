package javaCode;

import java.util.logging.Logger;

class AgeCatagory {
    public static final Logger logger=Logger.getLogger(AgeCatagory.class.getName());
    public static void main(String[] args) {
        logger.info("welcome to age selector");
        int age=80;
        if(age>90){
            logger.info("senior");
        }
        else if(age>20){
            logger.info("tenager");
        }
        else if(age>13){
            logger.info("kid");
        }
        else{
            System.out.printf("child");

        }
    }

}
