package MyList;

public class MyList <T>{
	private int size;
	private ListElem <T> head;      
  
    
	/**
	 * constructor without parameters
	 */
	MyList(){
		head = null;
		size = 0;
		}
	/**
	 * constructor with parameters
	 */
	MyList(T data){
		head = new ListElem<T>(data);
		size++;
	}
	/**
	 * Void check function
	 */
	public boolean isEmpty() {
        return head == null;
    }
	/**
	 * Function for getting the list size
	 */
	 public int getSize() {
	        return size;
	    }
	/**
	 * Function adding an item to the top of the list
	 */
	public void addFront (T data) {
		if (isEmpty()) {
			head = new ListElem<T>(data);
			size++;
		} else {
			ListElem<T> NewElem = new ListElem<T>(data);
			NewElem.next = head;
			head = NewElem;
			size++;
		}
	}
	/**
	 * Function adding an item to the end of the list
	 */
	public void addBack (T data) {
		if (isEmpty()) {
			head = new ListElem<T>(data);
			size++;
		} else {
			ListElem<T> pointer = head; 
			while (pointer.next!= null) {
				pointer = pointer.next;
			}
			pointer.next = new ListElem<T>(data);
			size++;
		}
	}
	
	/**
	 * The function of inserting an element into the list at a given index
	 */
	public void insertAt(int index, T data) throws Exception {
		if (index > size - 1) {
			throw new Exception("Exceeding the list size");
		}
		if (index == size) {
			addBack(data);
		} else if (index == 0) {
			addFront(data);
		} else {
			int count = 0;
			ListElem<T> pointer = head;
			while (count != index - 1) {
				pointer = pointer.next;
				count++;
			}
			ListElem<T> temp = pointer.next;
			pointer.next = new ListElem<T>(data);
			pointer.next.next = temp;
			size++;
		}
		}
	
	/**
	 * The function of deleting an item at the beginning of the list
	 */
	public void popFront () throws Exception {
		if(isEmpty()) {
			throw new Exception("Deletion is not possible. The list is empty");
		}
       head=head.next;
       size--;
    }
	/**
	 * the function of deleting an item at the end of the list
	 */
	public void popBack () throws Exception {
		if(isEmpty()) {
			throw new Exception("Deletion is not possible. The list is empty");
		}
       if (size==1) {
    	   head = null;
    	   size --;
       } else {
    	   ListElem<T> pointer = head;
    	   while(pointer.next.next != null)
    		   pointer = pointer.next;
           
    	   pointer.next = null;
    	   size--;
       }
       }
    /**
     * The function of removing an item from the list by a given index
     */
	public void popAt(int index) throws Exception{
		if(index > size - 1) {
			throw new Exception("Exceeding the list size");
		}
		if (index == 0) {
			popFront();
		} else if ( index == size - 1) {
			popBack();
		} else {
			int count = 0;
			ListElem<T> pointer = head;
			while (count != index - 1) {
				pointer = pointer.next;
				count++;
			}
			pointer.next = pointer.next.next;
			size--;
		}
	}
	/**
	 * Function of getting an item from a list by a given index
	 */
	public T getAt(int index) throws Exception{
		if(index > size - 1) {
			throw new Exception("Exceeding the list size");
		}
		ListElem<T> pointer = head;
		int count = 0;
		while (count!= index) {
			pointer = pointer.next;
			count++;
		}
		return pointer.data;
	}
	/**
	 * Print list items function
	 */
	void print() {
		if (size == 0) {
            System.out.println("Empty list");
            return;
        }
        var h = head;
        System.out.println("List: ");
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
	}
	 /**
     * Method equals comparing 2 different objects and checking each element
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        MyList<?> other = (MyList<?>) obj;
        if(this.size != other.size) {
            return false;
        }
        ListElem<?> tempMine = head;
        ListElem<?> tempOther = other.head;
        while(head != null){
            if(!tempMine.equals(tempOther)){
                return false;
            }
            tempMine = tempMine.next;
            tempOther = tempOther.next;
        }
        return true;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");

        ListElem<?> temp = head;
        while(temp != null){
            str.append(temp.data.toString()).append("; ");
            temp = temp.next;
        }
        return "LinkedList{\n  size: " + size +"\n  list: " + str + "\n}";
    }
	}

