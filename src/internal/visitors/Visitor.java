package internal.visitors;

import internal.entity.OrganisationUnitComposite;
import internal.entity.OrganisationUnitLeaf;

import java.util.function.Predicate;

public interface Visitor {
     void visit(OrganisationUnitComposite oc, Predicate<OrganisationUnitComposite> condition);
     void visit(OrganisationUnitLeaf ol, Predicate<OrganisationUnitLeaf> condition);
     Predicate<OrganisationUnitLeaf> test(OrganisationUnitLeaf test);
     Predicate<OrganisationUnitComposite> test(OrganisationUnitComposite oc);
}
