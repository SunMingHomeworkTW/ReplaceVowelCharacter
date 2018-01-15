package com.tw.practice;

import java.util.ArrayList;
import java.util.List;

public class ReplaceVowelChacter {
    public String replace(String inStr){
        if (inStr.equals(" "))
            return inStr;

        List<Character> vowelList=new ArrayList();
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');

        int vowelNum=0;
        for(int i=0;i<inStr.length();i++)
            if(vowelList.contains(inStr.charAt(i)))
                vowelNum++;

        if (vowelNum<=(inStr.length()*0.3))
            return inStr;

        StringBuffer outSb=new StringBuffer();
        if (inStr.length()==1){
            if (vowelList.contains(inStr.charAt(0)))
                outSb.append("mommy");
            else
                outSb.append(inStr);
        }
        else {
            boolean flag = false;
            if (vowelList.contains(inStr.charAt(0)))
                flag = true;
            else
                outSb.append(inStr.charAt(0));
            for (int i = 1; i < inStr.length() - 1; i++) {
                if (!(vowelList.contains(inStr.charAt(i)))) {
                    if (flag) {
                        outSb.append("mommy");
                        flag = false;
                    }
                    outSb.append(inStr.charAt(i));
                } else
                    flag = true;
            }
            if (vowelList.contains(inStr.charAt(inStr.length() - 1)))
                outSb.append("mommy");
            else if(flag){
                outSb.append("mommy");
                outSb.append(inStr.charAt(inStr.length() - 1));
            }
            else
                outSb.append(inStr.charAt(inStr.length() - 1));
        }

        return outSb.toString();
    }

    public boolean isValid(String inStr){
        if(inStr.equals(" "))
            return true;
        for(int i=0;i<inStr.length();i++)
            if(!((inStr.charAt(i)>='a'&&inStr.charAt(i)<='z')||(inStr.charAt(i)>='A'&&inStr.charAt(i)<='Z')))
                return false;
        return true;
    }
}