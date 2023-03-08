package dao;

public interface Idao<T,ID> {
    T trouverParId (ID id);
}
