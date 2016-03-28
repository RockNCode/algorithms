public class Date implements Comparable<Date>{
    private final int month, day,year;

    public Date(int m,int d,int y){
	this.month = m;
	this.day = d;
	this.year = y;
    }

    @Override
    public int compareTo(Date date){
	if(this.year > date.year) return 1;
	if(this.year < date.year) return -1;
	if(this.month > date.month) return 1;
	if(this.month < date.month) return -1;
	if(this.day > date.day) return 1;
	if(this.day < date.day) return -1;

	return 0;
    }
}
