/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
/**
 *
 * @author Jeffrey
 */
public class Password {
    //fields//
    private String phrase;
    private String account;
    
    //constructors//
    public Password()
    {
        phrase = "none";
        account = "none";
    }
    
    public Password(String a,String p)
    {
        phrase = p;
        account = a;
    }
    
    public Password(String a, int length)
    {
        account = a;
        phrase = createRandom(length);
    }
    //getters & setters//

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    //methods//
    public String createRandom(int n)
    {
        Random chargen = new Random();
        String pass = "";
        for(int i=0;i<n;i++)
        {
        	pass += Character.toString((char)(chargen.nextInt(126-33)+33));
        }
        return pass;
    }

}

