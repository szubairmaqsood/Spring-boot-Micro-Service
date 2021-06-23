package com.example.Spring.Cloud.Gatway

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalog")
class GateWayController {

    @Value("\${brand}")
    var brand:String? = null ;
    @Value("\${color}")
    var color:String? = null ;
    @Value("\${power}")
    var power:Int? = null ;

    @GetMapping("/gateway")
    fun gateWayProperty(){
            println(brand);
            println(color);
            println(power);
    }

}