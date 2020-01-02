package top.tohsaka.onestep.manager.base;

public interface BaseMng<T> {

    T save(T bean);

    T get(Number id);

    int update(T bean);

    int delete(Number id);
}
