package io.theforloop.google.practice.arrayAndString;

/**
 * @author Shubham
 */
public class SimplifyExpression {
    private class Result{
         int nextIndex;
         String result;
         Result(){
            this.nextIndex = 0;
            this.result = "";
        }
         Result(int nextIndex, String result) {
            this.nextIndex = nextIndex;
            this.result = result;
        }
    }
    public String simplifyExpression(String inputExp){
        String result =  simplify('+',inputExp);
        if(!result.isEmpty() && result.charAt(0) == '+'){
            return result.substring(1);
        }
        return result;
    }
    private String simplify(char sign,String inputExp){
        if(inputExp == null){
            return "";
        }
        int len = inputExp.length() ;
        if(len==0){
            return inputExp;
        }
        String result = "";
        for(int index = 0 ; index<len ; index++){
            char currCh = inputExp.charAt(index);
            if (Character.isAlphabetic(currCh)){
                result = result.concat(sign+""+currCh);
                continue;
            }
            if((currCh == '+' || currCh == '-') && (Character.isAlphabetic(inputExp.charAt(index+1)))){
                result = result.concat(evalSign(sign,currCh)+""+inputExp.charAt(index+1));
                index++;
                continue;
            }
            if((currCh == '+' || currCh == '-') && (inputExp.charAt(index+1) == '(')){
                Result r = getExp(inputExp,index+1);
                index = r.nextIndex;
                result = result.concat(simplify(currCh,r.result));
            }
        }
        return result;
    }
    private char evalSign(char input1 ,char input2){
        if(input1 == '-' && input2 == '-'){
            return '+';
        }
        if(input1 == '-' || input2 == '-'){
            return '-';
        }
        return '+';
    }
    private Result getExp(String input,Integer index){
        if(input == null){
            return new Result();
        }
        int len = input.length() ;
        if(len==0 || index>=len){
            return new Result();
        }
        int openBCntr = 1 ;
        int endIndex ;
        for( endIndex = index+1;endIndex<len && openBCntr>0;endIndex++ ){
            if(input.charAt(endIndex) == '('){
                openBCntr++;
                continue;
            }
            if(input.charAt(endIndex) == ')'){
                openBCntr--;
            }
        }
        return new Result(endIndex-1,input.substring(index+1,endIndex-1));
    }
}
