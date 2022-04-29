package com.letscode.Arquivo;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.IOException;

public class ArquivoTexto {
    public static void main(String[] args) throws IOException {
        editarArquivos();
    }

    public static void editarArquivos() throws IOException {
        FileReader read = new FileReader("Texto.txt");
        BufferedReader reading = new BufferedReader(read);

        FileOutputStream buffer =  new FileOutputStream("Texto2.txt");
        String line;

        while ((line = reading.readLine())!= null){
            line = line +"\n";

            buffer.write(line.getBytes());
        }
        buffer.close();
    }
}
