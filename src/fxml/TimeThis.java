package fxml;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Класс указывает время с которого надо вести отчёт. Время берётся из файла.
Если файла нет, он создаётся с текущей датой и временем. Его надо отредактировать.
 */


public class TimeThis {

    public TimeThis() {
    }

    private Date startTimeToGoal() {
        Date dataTime = new Date();
        String time = "";

        try {
            FileReader fr = new FileReader("Time.txt");
            BufferedReader read = new BufferedReader(fr);
            time = read.readLine();
            fr.close();

            System.out.println(time);

            SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);

            dataTime = format.parse(time);

        } catch (FileNotFoundException e){

            dataTime = write();

        } catch (ParseException e) {

            File file = new File("Time.txt");
            file.delete();

            dataTime = write();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataTime;

    }

    private Date write(){
        Date dataTime = new Date();

        String time = dataTime.toString();

        try{  FileWriter fw = new FileWriter("Time.txt");
            fw.write(time);

            fw.close(); }catch (IOException ex){ex.printStackTrace();}

        return dataTime;
    }

        public Date getTime(){
        return startTimeToGoal();
    }

}

