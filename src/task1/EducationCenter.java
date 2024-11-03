package task1;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locatedCountry;
    private LocalDate FoundationDate;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationDate) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        FoundationDate = foundationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getFoundationDate() {
        return FoundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        FoundationDate = foundationDate;
    }

    @Override
    public String toString() {
        return "\n <(EducationCenter)>" +
                "\nname='" + name +
                "\nlocatedCountry='" + locatedCountry +
                "\nFoundationDate=" + FoundationDate ;
    }
}
