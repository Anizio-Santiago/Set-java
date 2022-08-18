package application;


import entities.LogsEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o caminho da pasta: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogsEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line != null){
                String[] field = line.split(" ");
                String nome = field[0];
                Date momento = Date.from(Instant.parse(field[1]));

                set.add(new LogsEntry(nome,momento));

                line = br.readLine();
            }
            System.out.println("Numero de suarios : " + set.size());
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
