package com.example.Spring.Cloud.Gatway

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.env.Environment
import javax.print.attribute.IntegerSyntax


class ReRoute {
    /*
    @Value("\${brand}")
    lateinit  var brand: String;

    @Value("\${color}")
    lateinit var color: String;

    @Value("\${power}")
    lateinit var power:Int;


    @Autowired
    var env: Environment;


    @Autowired
    constructor(_env: Environment){
         this.env = Environment("");
        this.brand = env?.getProperty("brand");
        this.color = env?.getProperty("color");
        this.power = env?.getProperty("power")?.toInt();
    }

    /*
    fun constructor(@Value("\${power}")  power:Int, @Value("\${color}")  color:String, @Value("\${brand}") brand:String){
        this.brand = brand;
        this.color = color;
        this.power = power;
    }
   */
    /*
    fun constructor(){
        this.brand = brand;
        this.color = color;
        this.power = power;
    }*/

    fun print():Unit{

        println(brand);
        println(color);
        println(power);
        print(env);
    }
*/
}