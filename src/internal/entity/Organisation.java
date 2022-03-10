package internal.entity;

public class Organisation {
    private Address address;
    private String name;
    private String domainName;
    private OrganisationUnitComponent organisationUnit;

    public OrganisationUnitComponent getOrganisationUnit() {
        return organisationUnit;
    }

    public void setOrganisationUnit(OrganisationUnitComponent cto) {
        this.organisationUnit = cto;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
