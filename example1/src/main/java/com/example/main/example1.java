package com.example.main;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example1 {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Fortuner");
        System.out.println("Vehicle name from non-spring context is:"+vehicle.getName());
        /* The var keyword was introduced in java 10.Type Inference is used in var keyword
           in which it detects automatically the data type of a variable based on the surrounding context.
         */

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is :"+veh.getName());


         /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        * */
        String hello=context.getBean(String.class);
        System.out.println("String value from spring context is:"+hello);
        Integer num=context.getBean(Integer.class);
        System.out.println("Integer value from spring context is :"+num);
    }
}
