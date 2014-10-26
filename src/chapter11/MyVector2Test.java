package chapter11;

import java.util.*;

public class MyVector2Test {

	public static void Main(String[] args) {
		MyVector4 v = new MyVector4();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제 전 : " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println("삭제 후 : " + v);
	}
}

class MyVector4 extends MyVector3 implements Iterator{

	int cursor = 0;
	int lastRet = -1;
	
	public MyVector4(int capacity) {
		super(capacity);
	}
	
	public MyVector4() {
		this(10);
	}
	
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i=0; it.hasNext(); i++) {
			if(i!=0) tmp += ", ";
			tmp += it.next();
		}
		
		return "[" + tmp + "]";
	}
	
	public Iterator iterator() {
		cursor = 0;
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}
	
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	
	public void remove() {
		if(lastRet == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			
			if(lastRet < cursor)
				cursor--;
			
			lastRet = -1;
		}
	}
}

class MyVector3 implements List {
	protected Object[] data = null;
	protected int capacity = 0;
	protected int size = 0;
	
	public MyVector3(int capacity) {
		if(capacity < 0)
			throw new IllegalArgumentException("유효하지 않는 값입니다. :" + capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector3() {
		this(10);
	}
	
	public void ensureCapacity(int minCapacity) {
		int newCapacity = capacity;
		
		if(minCapacity > capacity) {
			newCapacity = capacity * 2;
		}
		
		if(minCapacity > newCapacity) {
			newCapacity = minCapacity;
		}
		
		setCapacity(newCapacity);
	}
	
	public boolean add(Object obj) {
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	public Object get(int index) {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
			
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		
		oldObj = data[index];
		
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i=0; i<size;i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	public void setCapacity(int capacity) {
		if(this.capacity==capacity) return;
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i=0; i<size; i++)
			data[i] = null;
		size = 0;
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	public boolean isEmpty() { return size == 0; }
	public int capacity() { return capacity; }
	public int size() { return size; }
	/**************************************************/
	/* List 인터페이스로부터 상속받는 메소드들                                  */
	/**************************************************/
	// public int size();
	// public boolean isEmpty();
	public boolean contains(Object o) { return false; }
	public Iterator iterator() { return null; }
	// public Object[] toArray();
	public Object[] toArray(Object a[]) { return null; }
	// public boolean add(Object o);
	// public boolean remove(Object o);
	public boolean containsAll(Collection c) { return false; }
	public boolean addAll(Collection c) { return false; }
	public boolean addAll(int index, Collection c) { return false; }
	public boolean removeAll(Collection c) { return false; }
	public boolean retainAll(Collection c) { return false; }
	// public void clear();
	public boolean equals(Object o) { return false; }
	// public int hashCode();
	// public Object get(int index);
	public Object set(int index, Object elemtnt) { return null; }
	public void add(int index, Object element) {}
	// public Object remove(int index);
	public int indexOf(Object o) { return -1; }
	public int lastIndexOf(Object o) { return -1; }
	public ListIterator listIterator() { return null; }
	public ListIterator listIterator(int index) { return null; }
	public List subList(int fromIndex, int toIndex) { return null; }
}