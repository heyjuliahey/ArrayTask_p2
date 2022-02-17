package by.reader;

import exception.CustomException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadArrayFromFile {
     public List<String> readFile(String fileName) throws exception.CustomException {
            List<String> customList = new ArrayList<>();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
                String str;

                while ((str = bufferedReader.readLine()) != null) {
                    customList.add(str);
                }

            } catch (FileNotFoundException e) {
                throw new CustomException("File " + fileName + " not found " + e);
            } catch
            (IOException e) {
                throw new CustomException("Exception: " + e);
            }
            return customList;
     }
}