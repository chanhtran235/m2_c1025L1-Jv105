package ss6_inheritance.util;

import ss6_inheritance.entity.Student;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeStringListToCSV(String filePath, List<String> stringList,boolean isAppend) {
        File file = new File(filePath);
        try (
                FileWriter fileWriter = new FileWriter(file,isAppend);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }

    }

    public static List<String> readFileCSVToStringList(String filePath){
        List<String> stringList = new ArrayList<>();
        // đọc file
        File file = new File(filePath);
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return stringList;
    }

    // ghi file nhị phân
    public  static void writeListStudentToBinaryFile(String filePath, List<Student> studentList){
        File file = new File(filePath);
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public  static List<Student> readBinaryFileToListStudent(String filePath){
        File file = new File(filePath);
        List<Student> studentList = new ArrayList<>();
        if (file.length()>0){
            try(FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
            ) {

                studentList = (List<Student>)objectInputStream.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("Không tìm thấy file");
            } catch (IOException e) {
                System.out.println("Lỗi ghi file");
            } catch (ClassNotFoundException e) {
                System.out.println("Không tìm thấy class");
            }
        }
        return studentList;
    }
}
