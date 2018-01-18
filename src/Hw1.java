

public class Hw1<T> implements ILinkedList<T> {
    private T data;
    private Hw1<T> next;
    public Hw1<T> next(){
        return next;

    }
    public Hw1<T> last(){
        Hw1<T> last= this;
        while (last.next!=null ){
            last=last.next;

        }
        return last;
    }

    public Hw1<T> after(int a){
        Hw1<T> last= this;
        for (int i=0; i<a; i++  ){
            last=last.next;

        }
        return last;
    }

    public Hw1<T> detach(){
        Hw1<T> temp= next;
        next = null;
        return temp;
    }
    public T get(){
        return data;
    }
    public void set (T b){
        data = b;

    }
    public void setNext(ILinkedList<T> next){
        this.next= (Hw1)next;

    }
    public void append(ILinkedList<T> next){
        Hw1<T> temp= this;
        while(temp.next!=null ){
            temp=temp.next;

        }
        temp.next=(Hw1)next;

    }
    public void insert (ILinkedList<T> newFirst){
        ((Hw1)newFirst).next=this;
    }
}
