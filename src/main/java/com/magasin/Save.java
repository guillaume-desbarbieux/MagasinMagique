package com.magasin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
    private final File dossierData = new File("data");
    private final File goldenMaster = new File(dossierData, "save.txt");


    public void saveText(String text){
        if (!dossierData.exists()) {
            if (!dossierData.mkdirs()) {
                System.out.println("Error can't create 'data'.");
                return;
            }
        }

        try (FileWriter writerPlayer = new FileWriter(goldenMaster, true)) {
            writerPlayer.write(text + "\n");
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
