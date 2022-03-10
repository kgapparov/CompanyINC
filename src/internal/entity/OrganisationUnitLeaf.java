package internal.entity;

import internal.visitors.Visitor;

public class OrganisationUnitLeaf extends OrganisationUnitComponent{

    OrganisationUnitLeaf(int size, OrganisationUnitComposite oc) {
        super(size);
        oc.addOrganisationComponent(this);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this, v.test(this));
    }
}
