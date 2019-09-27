/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.hellofxml.bll;

import javafx.scene.control.TextField;

/**
 *
 * @author pgn
 */
public class StringUtils
{

    /**
     * Adds enclosing tags ( < and > ) to the given text.
     *
     * @param input The text to add tags to.
     * @return The tag enclosed text.
     */
    public String addTagsToText(String input)
    {
        String txt = "<" + input + ">";
        return txt;
    }

    public String dontDothisAtHome(TextField txtField)
    {
        return txtField.toString();
    }

    /**
     * Returns the length of the given text.
     *
     * @param input The text to count the characters of.
     * @return The text's character count.
     */
    public int nrOfCharsInTxt(String input)
    {
        return input.length();
    }

    public String addSnabelA(String input)
    {
        int count = nrOfCharsInTxt(input);
        String output = "";
        for (int i = 0; i < count - 1; i++)
        {
            output = output + input.charAt(i) + "@";
        }
        output = output + input.charAt(input.length() - 1);
        return output;
    }

    /**
     * Adds the @ sign in between all characters of the text.
     *
     * @param input The text to add @'s to.
     * @return The text that includes @'s.
     */
    public String addAtToText(String input)
    {
        String output = "";
        for (int i = 0; i < input.length(); i++)
        {
            if (i < input.length() - 1)
            {
                output = output + input.charAt(i) + "@";
            } else
            {
                output = output + input.charAt(i);
            }
        }
        return output;
    }

    public String myReverseString(String input)
    {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    /**
     * Returns the reversed version of the given text.
     *
     * @param input The text to reverse.
     * @return The reversed text.
     */
    public String reverseText(String input)
    {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--)
        {
            output += input.charAt(i);
        }
        return output;
    }

    private String[] english =
    {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
        "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
        ",", ".", "?", " "
    };

    private String[] morseAlphabet =
    {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        "-----", "--..--", ".-.-.-", "..--..", "/"
    };

    
    public String convertToMorse(String input)
    {
        String output = "";
        
        char[] chars = input.toCharArray();

        for (char c : chars)
        {
            for (int i = 0; i < english.length; i++)
            {
                String englishChar = english[i];
                String letterFromInput = c + "";
                
                if(letterFromInput.equalsIgnoreCase(englishChar))
                {
                    output = output + morseAlphabet[i] + "   ";
                    break;
                }
            }
        }
        return output;
    }

}
