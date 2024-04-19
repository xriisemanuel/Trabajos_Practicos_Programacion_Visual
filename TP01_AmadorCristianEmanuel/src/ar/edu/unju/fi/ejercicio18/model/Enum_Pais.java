package ar.edu.unju.fi.ejercicio18.model;

public enum Enum_Pais {
    AR("AR", "Argentina"),
    UY("UY", "Uruguay"),
    CL("CL", "Chile"),
    BO("BO", "Bolivia"),
    BR("BR", "Brasil"),
    PE("PE", "Perú"),
    PY("PY", "Paraguay");

    private final String code;
    private final String name;

    Enum_Pais(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
