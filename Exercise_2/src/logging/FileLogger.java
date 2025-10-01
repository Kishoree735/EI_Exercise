package logging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class FileLogger implements RocketObserver 
{
    private String filePath;

    public FileLogger(String filePath) 
    {
        this.filePath = filePath;
        ensureLogFileExists();
    }

    private void ensureLogFileExists() 
    {
        try 
        {
            File file = new File(filePath);
            File parentDir = file.getParentFile();
            
            if (parentDir != null && !parentDir.exists()) 
            {
                parentDir.mkdirs();
            }
            
            if (!file.exists()) 
            {
                file.createNewFile();
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Warning: Could not create log file: " + e.getMessage());
        }
    }

    @Override
    public void update(String message) 
    {
        if (message == null || message.trim().isEmpty()) 
        {
            return;
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(filePath, true))) 
        {
            out.println(message);
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
        
        System.out.println(message);
    }
}