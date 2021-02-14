package edu.isu.cs.cs2263.hw02;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class PushbackTokenizerImpl implements PushbackTokenizer {

    private StringTokenizer STokenizer;
    private String str;
    private int nextCount = 0;

    public PushbackTokenizerImpl(String s){
        str = s;
        STokenizer = new StringTokenizer(s);
    }

    @Override
    public String nextToken() {
        nextCount++;
        return STokenizer.nextToken();
    }

    @Override
    public boolean hasMoreTokens() {
        return STokenizer.hasMoreTokens();
    }

    @Override
    public void pushback() {
        STokenizer = new StringTokenizer(str);
        for(int i = 0; i < nextCount-1; i++){
            STokenizer.nextToken();
        }
        if(nextCount > 0){
            nextCount--;
        }
    }
}
