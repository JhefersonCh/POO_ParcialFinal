public class Aeropuerto {
    private String code;
    private String name;
    private String population;
    private String country;
    private String GMT;

    public Aeropuerto(String code, String name, String population, String country, String GMT) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.country = country;
        this.GMT = GMT;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGMT() {
        return GMT;
    }

    public void setGMT(String GMT) {
        this.GMT = GMT;
    }

    public void showInfo(){
        System.out.println(getCode());
    }
}
