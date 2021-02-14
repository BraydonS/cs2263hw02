package edu.isu.cs.cs2263.hw02;

public interface PushbackTokenizer {
    String nextToken();

    boolean hasMoreTokens();

    void pushback();
}

