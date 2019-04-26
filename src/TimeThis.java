import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeThis {

    public TimeThis() {
    }

    private Date startTimeToGoal() {
        Date dataTime = new Date();
        String time = "";

        try {
            FileReader fr = new FileReader("Time.txt");
            Scanner scan = new Scanner(fr);
            time = scan.toString();
            fr.close();

            SimpleDateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");

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

