
public class DateThree {
    
    private int day = 0;
    private int month = 0;
    private int year = 0;
    
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;        
        
        
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDate(int d, int m, int y){
        if(y > 1000 && y < 10000){
            this.year = y;
        }else{
            System.out.println(y + "is not a valid year. ");
            this.year = 0;   
        }
        switch (m){
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.month = m;
                if(d > 0 && d < 32){
                    this.day = d;
                }else{
                    System.out.println(d + "is an invalid day for " + month);
                    this.day = 0;
                }
                break;
        }
    }
}
