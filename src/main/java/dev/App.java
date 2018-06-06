package dev;

import com.github.lalyos.jfiglet.FigletFont;


public class App 
{
    public static void main( String[] args )
    {
    	
    	String asciiArt = "Hello World !";
        System.out.println(FigletFont.convertOneLine(asciiArt));
    }
}
