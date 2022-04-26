package com.platzi.javatests.util;

public class StringUtil {


    public boolean isEmpty(String srt) {

        if(srt == null){
            return true;
        }else if(srt.isEmpty()){
            return true;
        }else if(srt.length() == 0){
            return true;
        }else if(srt.trim().length() != srt.length()){
            return true;
        }
        return false;
    }

}
