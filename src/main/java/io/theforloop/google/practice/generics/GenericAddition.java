package io.theforloop.google.practice.generics;

public class GenericAddition {

    public <U extends Number> double add(U input1, U input2){
        return input1.doubleValue()+input2.doubleValue();
    }
    public <U extends String> String add(U input1, U input2){
        return input1.concat(input2);
    }

}
