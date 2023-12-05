public class Vuelo {
    private String x;
    private String departureAirport;
    private String arrivalAirport;
    private String duration;
    private String company;
    private String typePlane;
    private int seats;
    private String optional;
    private String schedule;

    public Vuelo(String x, String departureAirport, String arrivalAirport, String duration, String company, String typePlane, int seats,String optional, String schedule) {
        this.x = x;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.duration = duration;
        this.company = company;
        this.typePlane = typePlane;
        this.seats = seats;
        this.optional = optional;
        this.schedule = schedule;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        arrivalAirport = arrivalAirport;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
