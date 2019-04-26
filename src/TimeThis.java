import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

        } catch (FileNotFoundException | ParseException e) {



            dataTime = new Date();

            time = dataTime.toString();

          try{  FileWriter fw = new FileWriter("Time.txt");
            fw.write(time);

            fw.close(); }catch (IOException ex){ex.printStackTrace();}

        } catch (IOException e) {
            e.printStackTrace();
        }


        return dataTime;

    }
        public Date getTime(){
        return startTimeToGoal();
    }

}

