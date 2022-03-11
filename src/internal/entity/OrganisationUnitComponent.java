package internal.entity;

import internal.visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;

public abstract class OrganisationUnitComponent {
    private Collection<Vacancy> vacancyes;
    private String name;
    private String id;
    private Budget budget;
    private Vacancy manager;

    OrganisationUnitComponent(int size, Organisation org){
        vacancyes = new ArrayList<>(size);
        org.setOrganisationUnit(this);
    }

    OrganisationUnitComponent(int size) {
        vacancyes = new ArrayList<>(size);
    }

    public void addVacancy(Vacancy vacancy) {
        this.vacancyes.add(vacancy);
    }

    public Collection<Vacancy> getVacancyes() {
        return vacancyes;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Vacancy getManager() {
        return manager;
    }

    public void setManager(Vacancy manager) {
        this.manager = manager;
    }

    public abstract void accept(Visitor v);
}
