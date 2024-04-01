public class Dragon {

    private int count;

    public Dragon(){
        count = 1;
    }

    public void addNew(){
        count++;
    }

    public void addNew(int n){
        count += n;
    }

    public void remove(){
        count--;
    }

    public void remove(int n){
        count -= n;
    }

    public int getCount(){
        return count;
    }
}
