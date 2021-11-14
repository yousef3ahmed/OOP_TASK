
import  java.util.Date;
import java.util.Calendar ;

public class sol{


    class time{
        public int hour , minute , second ;

        time(){
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            hour = calendar.get(Calendar.HOUR);  
            minute = calendar.get(calendar.MINUTE) ;
            second = calendar.get(calendar.SECOND) ;

        }

        time( int hour , int minute , int second ){
            this.hour = hour ;
            this.minute = minute ;
            this.second = second ;
        }

        public int get_hour( ){
            return hour ;
        }

        public int get_second( ) {
            return second ;
        }


        public int get_minute( ) {
            return minute ;
        }

        public void elapsed_time( int millisecond ){
            int MOD = 3600 * 1000 ;
            hour = millisecond / MOD ;
            
            int rem_ = millisecond % MOD ;
            MOD/=60 ;
            minute = rem_ / MOD ;

            rem_ = rem_ % MOD ;
            MOD/=60 ;
            second = rem_ % MOD ;

        }


    }

    public static void  main(String[] args) {
        

    }
}