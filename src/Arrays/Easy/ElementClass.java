package Arrays.Easy;

public class ElementClass {
    int firstOcc, lastOcc;

    ElementClass(){
        firstOcc = lastOcc = -1;
    }

    public void updateOccurrence(int index){
        if(this.firstOcc == -1){
            firstOcc = index;
        }
        lastOcc = index;
    }
}
