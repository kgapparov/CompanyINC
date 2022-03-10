package internal.entity;

import internal.visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public abstract class OrganisationUnitComponent {
    private Collection<Vacancy> vacancyes;
    private String name;
    private String id;
    private Double budget;
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

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
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
