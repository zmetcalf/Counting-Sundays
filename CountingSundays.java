public class CountingSundays {
    
    public static void main(String [] args) {
        
        int sundayCounter = 0;
        int dayOfTheWeek = 2; //Sunday = 0
        
        for (int year = 1901; year < 2001; year++) {
            for (int month = 1; month <= 12; month++) {
                if((getDays(month, year) % 7) + dayOfTheWeek > 6) {
                    dayOfTheWeek += ((getDays(month, year) % 7) - 7);
                }
                else {
                    dayOfTheWeek += (getDays(month, year) % 7);
                }
                if(dayOfTheWeek == 0) {
                    sundayCounter++;
                }
            }
        }
        System.out.printf("There are %d Sundays!\n", sundayCounter);
        
    }
    
    public static int getDays(int month, int year) {
        
        int days = 0;
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2: 
                if(year % 4 == 0) {
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            default: 
                break;
        }
        
        return days;
    }
}