package com.kotlinfarsi.introduction.interop;

import com.kotlinfarsi.introduction.classes.CustomerKotlin;
import com.kotlinfarsi.introduction.classes.CustomerKotlinKt;

/**
 * Created by Sina on 8/6/2017.
 */
public class TalkingToKotlin {
    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1,"Sina","Sinadarvi@gmail.com");
        customerKotlin.setEmail("Sina@darvishi.net");
        customerKotlin.someProperty = "this is not Property No more";
        customerKotlin.changeStatus("NOT_OK");
        customerKotlin.changeStatus();

        TopLevelFunctionsKt.prefix("Hi","Sina");

        CustomerKotlinKt.extention(customerKotlin);

    }
}
