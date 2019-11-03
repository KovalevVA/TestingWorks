package wkda.api;

public enum EndPointBuiltDates {

    BUILT_DATES("/built-dates");

    String path;

    EndPointBuiltDates(String path) {this.path = path;}

    public String getPath() {return path;}

    public String addPath(String additionalPath) {return path + additionalPath;}
}
