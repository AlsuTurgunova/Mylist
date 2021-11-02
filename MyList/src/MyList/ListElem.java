package MyList;

public class ListElem<T> {
	T data;
ListElem<T> next;

public ListElem( T Tdata ) {
	data= Tdata;
	next = null;
}
@Override 
public boolean equals(Object obj) {
	if (obj == this) {
		return true;
	}
	 if (obj == null || obj.getClass() != this.getClass()) {
         return false;
     }
     ListElem<?> other = (ListElem<?>) obj;
     if(!this.data.equals(other.data) || !this.next.equals(other.next)) {
         return false;
     }
     return true;
}
@Override
public String toString() {
    return "Node{\ndata: " + data.toString() +"\n next: " + next.toString() + "}";
}
}

