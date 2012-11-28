package zad1.zad1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class ListaKawiarni implements Collection<Kawiarnia>{

	private List<Kawiarnia> kawiarnie = new ArrayList<Kawiarnia>();
	private osoba owner;

	public ListaKawiarni(osoba owner)
	{
		this.owner=owner;
	}


	public int size() {
		return kawiarnie.size();
	}

	public boolean isEmpty() {
		return kawiarnie.isEmpty();
	}


	public boolean contains(Object o) {
		
		return kawiarnie.contains(o);
	}


	public Iterator<Kawiarnia> iterator() {
		// TODO Auto-generated method stub
		return kawiarnie.iterator();
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return kawiarnie.toArray();
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return kawiarnie.toArray(a);
	}


	public boolean add(Kawiarnia e) {
		// TODO Auto-generated method stub
		e.setOwner(owner);
		return kawiarnie.add(e);
	}


	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return kawiarnie.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return kawiarnie.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Kawiarnia> c) {

		for(Kawiarnia kawiarnia : kawiarnie)
		{
			kawiarnia.setOwner(owner);
		}

		return kawiarnie.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return kawiarnie.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return kawiarnie.retainAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		kawiarnie.clear();
	}



}