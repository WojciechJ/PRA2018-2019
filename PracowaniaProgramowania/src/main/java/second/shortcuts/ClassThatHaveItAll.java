package second.shortcuts;
import org.apache.log4j.Logger;

import java.util.List;

public class ClassThatHaveItAll implements InterfaceOne {

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ClassThatHaveItAll.class);
    String name;
    Integer number;
    List<Long> list;

    public ClassThatHaveItAll(String name, Integer number, List<Long> list) {
        this.name = name;
        this.number = number;
        this.list = list;
    }

    public static Logger getLogger() {
        return logger;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public List<Long> getList() {
        return list;
    }

    public void printMe(String info) {
        logger.info(info);
    }

    public void usageOfPrint() {
        printMe("Hi");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }
}
