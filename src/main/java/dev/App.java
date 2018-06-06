package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;


public class App 
{
    public static void main( String[] args )
    {
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	//String asciiArt = "Hello World !";
        System.out.println(FigletFont.convertOneLine(titre));
        
        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environement : "+environnement);
    }
}
