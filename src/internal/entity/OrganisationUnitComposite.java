package internal.entity;

import internal.visitors.Visitor;

import java.util.Collection;
import java.util.function.Predicate;

public class OrganisationUnitComposite extends OrganisationUnitComponent{

    private Collection<OrganisationUnitComponent> organisationUnits;

    public OrganisationUnitComposite(int size, Organisation org) {
        super(size, org);
    }

    public OrganisationUnitComposite(int size) {
        super(size);
    }

    public Collection<OrganisationUnitComponent> getOrganisationUnits() {
        return organisationUnits;
    }
    public void addOrganisationComponent(OrganisationUnitComponent oc) {
        this.organisationUnits.add(oc);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this, v.test(this));
        for (OrganisationUnitComponent oc : organisationUnits ) {
            oc.accept(v);
        }
    }
}
