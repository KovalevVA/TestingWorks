package wkda.api;

public enum EndPointManufacturer {
    MANUFACTER("/manufacturer");

    String path;

    EndPointManufacturer(String path) {this.path = path;}

    public String getPath() {return path;}

    public String addPath(String additionalPath) {return path + additionalPath;}

}
