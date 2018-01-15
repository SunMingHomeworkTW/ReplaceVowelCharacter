package com.tw.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReplaceVowelChacterTest {
    ReplaceVowelChacter replaceVowelChacter=new ReplaceVowelChacter();

    @Test
    public void shouldReturnTrueWhenInputValid(){
        assertTrue(replaceVowelChacter.isValid("abc"));
    }

    @Test
    public void shouldReturnFalseWhenInputInvalid(){
        assertFalse(replaceVowelChacter.isValid("123abc"));
    }

    @Test
    public void shouldReturnBlankWhenInputBlank(){
        assertEquals(" ",replaceVowelChacter.replace(" "));
    }

    @Test
    public void shouldReturnmommyWhenInputAVowel(){
        assertEquals("mommy",replaceVowelChacter.replace("a"));
    }

    @Test
    public void shouldReturnItselfWhenInputANotVowel(){
        assertEquals("b",replaceVowelChacter.replace("b"));
    }

    @Test
    public void shouldReturnReplacedWhenInput30Vowel(){
        assertEquals("shmommy",replaceVowelChacter.replace("she"));
    }

    @Test
    public void shouldReturnReplacedWhenInputVowels(){
        assertEquals("hmommyr",replaceVowelChacter.replace("hear"));
    }
}

