package wkda.api;

public enum EndPointBodyTypes {
    BODY_TYPES("/body-types");

    String path;

    EndPointBodyTypes(String path) {this.path = path;}

    public String getPath() {return path;}

    public String addPath(String additionalPath) {return path + additionalPath;}
}
