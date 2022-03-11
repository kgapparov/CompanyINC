package internal.dao;

import internal.entity.OrganisationUnitComponent;

import java.util.Collection;

public interface OrganisationUnitDAO {
    OrganisationUnitComponent getByID(int id);
    boolean save(OrganisationUnitComponent oc);
    Collection<OrganisationUnitComponent> getAllOU();
    boolean update(OrganisationUnitComponent ou);
    boolean delete(OrganisationUnitComponent ou);
    boolean delete(int id);
}