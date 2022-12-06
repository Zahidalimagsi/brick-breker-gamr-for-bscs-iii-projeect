
package poject_game;

import java.util.Scanner;
import javax.swing.JFrame;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOException;


public class Poject_Game {

    private static String score;


    public  void write(File file, String message)throws IOException{
    
        if(file.isFile()){
        FileWriter writer = new FileWriter(file, true);
        
        writer.write(message);
        writer.close();
        }
        else 
            throw new IOException("Exception");
    
    }

    public static void main(String[] args) {

        
        
        
		JFrame obj=new JFrame();
		Gameplay gamePlay = new Gameplay();
		    Poject_Game o=new Poject_Game();  
                               Scanner s=new Scanner(System.in);
                    
                    String  playerName= s.nextLine();
                     
        try {
       
        File file = new File("C:\\Users\\Mashoriiii sahb\\Documents\\NetBeansProjects\\love.txt");
        file.createNewFile();

                                System.out.println();

        o.write(file,"\n"+playerName+"  ");
                                System.out.println();

      
        } catch (IOException ex) {
            
            System.out.println(ex);
        }
        
    
                
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
                obj.setTitle(playerName);
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true);

                



    }
    
}
