public class sol{



    class type{
        public int premium , gold , silver ;
        public double total = 0 ;
       
        // init type
        type( int premium , int gold, int silver ){
            this.premium = premium ;
            this.gold = gold ;
            this.silver = silver ;
        }

        public void discount(  ){
            if( premium == 1 ){
                total = total - total * 0.20; 
            }else if( gold == 1 ){
                total = total - total* 0.15 ;
            }else if( silver == 1 ){
                total = total - total* 0.10 ;
            }
        }

    }

    class discount_system{
        public type ty;
        
        public void set_premium(  ){
            ty = new type( 1 , 0 , 0 ) ;
        }

        public void set_gold(  ){
            ty = new type( 0 , 1 , 0 ) ;
        }

        public void set_silver(  ){
            ty = new type( 0 , 0 , 1 ) ;
        }

        public double after_discount( ){
            ty.discount(); 
            return ty.total ;
        }
        

    }


    public static void main(String[] args) {
        
    }

}