package internal.dao;

import internal.entity.Address;

import java.util.Collection;

public interface AddressDAO {
    Address getByID(int id);
    boolean save(Address address);
    Collection<Address> getAllOU();
    boolean update(Address address);
    boolean delete(Address address);
    boolean delete(int id);
}
