package core_java;

    class MinutesToYears {
        void minToYrs() {
            int minutes = 3000010 ;
            int year=minutes/(365*24*60);
            System.out.println("Year=:"+year);
            int days=minutes/(24*60)%365;
            System.out.println("Days=:"+days);
            int hours=minutes/60%24;
            System.out.println("Hours=:"+hours);
            int remaining_minutes=minutes%60;
            System.out.println("Second=:"+remaining_minutes);
        }
    }       
    public class Demo018 {
        public static void main(String[] args) {
            MinutesToYears obj = new MinutesToYears();
            obj.minToYrs();
        }
    }