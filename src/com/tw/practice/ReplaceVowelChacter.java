package com.tw.practice;

import java.util.ArrayList;
import java.util.List;

enum VowelCharacter {
    a, e, i, o, u;
}

public class ReplaceVowelChacter {
    private static final String MOMMY = "mommy";
    private List<Character> vowelList = new ArrayList();

    public ReplaceVowelChacter() {
        //��ʼ��Ԫ����ĸ�б�
        for (VowelCharacter vc : VowelCharacter.values())
            vowelList.add(vc.toString().charAt(0));
    }

    public String replace(String inStr) {
        //Ϊ�ո�ֱ�ӷ���
        if (inStr.equals(" "))
            return inStr;

        int length = inStr.length();
        //Ԫ����ĸ����С��30%��ֱ�ӷ���
        if (getVowelNum(inStr) <= (length * 0.3))
            return inStr;

        //ֻ��һ��Ԫ���ַ���ֱ�ӷ��ء�mommy��
        if (length == 1 && vowelList.contains(inStr.charAt(0)))
            return (MOMMY);

        StringBuffer outSb = new StringBuffer();
        boolean flag = false;
        outSb.append(inStr.charAt(0));
        for (int i = 1; i < length - 1; i++) {
            if (!(vowelList.contains(inStr.charAt(i)))) {
                if (flag) {
                    outSb.append(ReplaceVowelChacter.MOMMY);
                    flag = false;
                }
                outSb.append(inStr.charAt(i));
            } else
                flag = true;
        }

        //���һ���ַ���������
        if (vowelList.contains(inStr.charAt(length - 1))){
            outSb.append(ReplaceVowelChacter.MOMMY);
            return outSb.toString();
        }
        if (flag) {
            outSb.append(ReplaceVowelChacter.MOMMY);
            outSb.append(inStr.charAt(length - 1));
            return outSb.toString();
        }
        outSb.append(inStr.charAt(length - 1));

        return outSb.toString();
    }

    public boolean isInputStringValid(String inStr) {
        if (inStr.equals(" "))
            return true;

        for (int i = 0; i < inStr.length(); i++)
            if (!Util.isaLetter(inStr.charAt(i)))
                return false;

        return true;
    }

    private int getVowelNum(String str){
        int vowelNum = 0;
        int length=str.length();
        
        for (int i = 0; i < length; i++)
            if (vowelList.contains(str.charAt(i)))
                vowelNum++;

        return vowelNum;
    }
}