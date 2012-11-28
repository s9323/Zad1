package zad1.zad1;

import java.util.List;

public interface wlascicielInterface<TEntity> {
	

		public TEntity get(int id);
		public List<TEntity> getAll();
		public boolean save(TEntity obj);
		public boolean delete(TEntity obj);

}
