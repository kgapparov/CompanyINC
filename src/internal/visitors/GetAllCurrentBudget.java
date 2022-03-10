package internal.visitors;

import internal.entity.OrganisationUnitComposite;
import internal.entity.OrganisationUnitLeaf;

import java.util.function.Predicate;


public class GetAllCurrentBudget implements Visitor{
    private Double budget;

    public Double getBudget() {
        return budget;
    }

    @Override
    public void visit(OrganisationUnitComposite oc, Predicate<OrganisationUnitComposite> condition) {
        if (condition.test(oc)) {
            budget += oc.getBudget();
        }
    }

    @Override
    public void visit(OrganisationUnitLeaf ol, Predicate<OrganisationUnitLeaf> condition) {
        if (condition.test(ol)) {
            budget += ol.getBudget();
        }
    }

    @Override
    public Predicate<OrganisationUnitLeaf> test(OrganisationUnitLeaf test) {
        return new Predicate<OrganisationUnitLeaf>() {
            @Override
            public boolean test(OrganisationUnitLeaf organisationUnitLeaf) {
                return true;
            }
        };
    }

    @Override
    public Predicate<OrganisationUnitComposite> test(OrganisationUnitComposite oc) {
        return new Predicate<OrganisationUnitComposite>() {
            @Override
            public boolean test(OrganisationUnitComposite organisationUnitComposite) {
                return true;
            }
        };
    }
}
