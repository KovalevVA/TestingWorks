package wkda.api;

public enum EndPointMainTypes {

    MAIN_TYPES("/main-types");

    String path;

    EndPointMainTypes(String path) {this.path = path;}

    public String getPath() {return path;}

    public String addPath(String additionalPath) {return path + additionalPath;}
}
