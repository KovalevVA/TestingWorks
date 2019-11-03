package wkda.api;

public enum EndPointMainTypesDetails {

    MAIN_TYPES_DETAILS("/main-types-details");

    String path;

    EndPointMainTypesDetails(String path) {this.path = path;}

    public String getPath() {return path;}

    public String addPath(String additionalPath) {return path + additionalPath;}
}
