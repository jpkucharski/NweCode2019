package main;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public class AnonymousClass {

    private static final String PATH = "c:/Temp";
    private static final String EXTENSION = ".java";


    public static void main (String[] args){
        AnonymousClass ac = new AnonymousClass();
        ac.run();

    }
    private void run(){
        printFilesList(gettingTheFiles(creatingFileFilter()));
        printFilesList(gettingTheFiles(creatingFileFilterLambda()));
        printFileListLambda();
    }

    private void printFilesList(File[] files) {
        for(int i = 0; i<files.length; i++){
            System.out.println(files[i]);
        }
    }

    private FileFilter creatingFileFilter() {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(EXTENSION);
            }
        };
        return fileFilter;
    }

    private File[] gettingTheFiles(FileFilter fileFilter){
        File dir = new File(PATH);
        File[] javaFiles = dir.listFiles(fileFilter);
        return javaFiles;
    }

    private FileFilter creatingFileFilterLambda(){
        FileFilter fileFilter = (File file) -> file.getName().endsWith(EXTENSION);
        return fileFilter;
    }

    private void printFileListLambda(){
        List listOfFiles = Arrays.asList(gettingTheFiles(creatingFileFilterLambda()));
        listOfFiles.forEach(file-> {
            if(file.toString().endsWith("zzz.java")){
                System.out.println(file);
            }
        });
    }
}