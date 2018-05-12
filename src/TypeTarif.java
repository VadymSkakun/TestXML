public class TypeTarif {
    private String name;
    private String operator;
    private Simple payrol;
    private TypeCallPrices callPrices;
    private Simple sms;
    private TypeParameters parameters;

    public TypeTarif(String name, String operator, Simple payrol, TypeCallPrices callPrices, Simple sms, TypeParameters parameters) {
        this.name = name;
        this.operator = operator;
        this.payrol = payrol;
        this.callPrices = callPrices;
        this.sms = sms;
        this.parameters = parameters;
    }
}
