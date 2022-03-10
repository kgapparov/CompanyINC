package internal.entity;

import internal.entity.enums.VacancyStatus;

import java.time.LocalDate;

public class Vacancy {
    private OrganisationUnitComponent organisationUnit;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double salary;
    private Double bonus;
    private VacancyStatus status;
    Vacancy(OrganisationUnitComponent oc) {
        oc.addVacancy(this);
        status = VacancyStatus.VACANT;
    }
    private Employee employee;
}
