public class sol{


    class point{
        private int x , y ;
        point(   ) {
            x = 0 ;
            y = 0 ;
        }

        point ( int x , int y ){
            this.x = x;
            this.y = y  ;
        }

        public int get_x(  ){
            return x ;
        }

        public int get_y( ) {
            return y ;
        }

        public double distance( int x , int y ){
            
            int difx = Math.abs( this.x - x  ) ;
            int dify = Math.abs( this.y - y  ) ;
            difx*=difx ;
            dify*=dify ;
            double ans = Math.pow(  ( difx + dify ) , 0.5) ;

            return ans ;
        }

    }


    public static void main(String[] args) {
        
    }

}