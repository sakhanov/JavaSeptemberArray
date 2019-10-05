package Lesson2;
// тест1
import java.util.Arrays;

class ArraySort{
    private float[] array;
    private int size;
    private  int pointer = 0;

    public ArraySort(int size) {
        this.size = size;
        this.array = new float[this.size];
    }

    public int getSize() {
        return size;
    }

    public int getPointer() {
        return pointer;
    }
    public void remove(int i){
        this.pointer--;
        for(; i < this.getPointer();i++){
            this.put(i, this.get(i+1));
        }
    }
    public boolean find(float a){
        for (int i =0; i< this.getPointer(); i++){
            if( this.get(i) == a ){
                return  true;
            }
        }
        return false;
    }
    public boolean BinnayFind(float a){
        int min = 0;
        int max = this.getPointer();
        while(min<= max){
            int avr = (min + max) / 2;
            if(this.get(avr) == a){
                return true;
            }
            if(this.get(avr) > a){
                max = avr;
            }else{
                min = avr;
            }
        }
        return false;
    }
    public void insert(float a){
        //this.array[ this.pointer++ ] = a;
        this.put(this.pointer++, a);
    }
     public void put(int i, float a){
         this.array[i] = a;
     }
     public  float get(int i){
        return this.array[i];
     }
     public  void fillRandom(){
        for(int i=0; i< this.getSize(); i++){
            this.insert((float) Math.random());
        }
     }
     public void change(int i, int j){
        float a = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = a;
     }
     void printArray(){
        System.out.println(Arrays.toString(this.array));
     }
     public  void sort(){
        int Count = this.getPointer() ;
        int i = 0, j = 0;
        for(i=0; i<Count - 1; i++){
            for(j=i+1; j<Count; j++){
                if(this.get(i) > this.get(j)){
                    this.change(i,j);
                }
            }
        }
     }
     public  void sortInsert(){
        int in, out;
        int len = this.getPointer();
        for(out = 1; out < len; out++){
            float temp = this.get(out);
            in = out;
            while(in > 0 && this.get(in - 1) >= temp){
                this.put(in, this.get(in - 1));
                in --;
            }
            this.put(in, temp);
        }
     }

}

public class Sorting {
    public  static  void main(String[] args){
        int Count = 100000;
        ArraySort arr1 = new ArraySort(Count);
        arr1.fillRandom();
        ArraySort arr2 = new ArraySort(Count);
        arr2.fillRandom();
        //arr1.printArray();
        System.out.println("Start");
        float a = arr1.get(5);
        arr1.sortInsert();
        System.out.println(arr1.BinnayFind(a));

        //arr1.printArray();
        System.out.println("Start 1");
        arr2.sort();
        System.out.println("Start 3");

    }
}
