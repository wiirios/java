public enum StatesEnum {
    SAOPAULO("SÃO PAULO", "SP"),
    RIODEJANEIRO("RIO DE JANEIRO", "RJ");

    private String name;
    private String code;
    StatesEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }
}
