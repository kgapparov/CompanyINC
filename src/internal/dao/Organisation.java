package internal.dao;

import internal.dao.Organisation;

import java.util.Collection;

public interface Organisation {
    Organisation getByID(int id);
    boolean save(Organisation organisation);
    Collection<Organisation> getAllOU();
    boolean update(Organisation organisation);
    boolean delete(Organisation organisation);
    boolean delete(int id);
}
