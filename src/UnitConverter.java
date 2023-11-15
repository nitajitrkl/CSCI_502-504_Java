public class UnitConverter {
    public UnitConverter(String iOrigin, String iDestination, double iAmount) {
        origin = iOrigin;
        destination = iDestination;
        amount = iAmount;
    }
    public double convertTo () {
        switch (origin){
            case "in": {
                switch (destination) {
                    case "in": return amount;
                    case "ft": return amount * IN_FT;
                    case "mi": return amount * IN_MI;
                    case "mm": return amount * IN_MM;
                    case "cm": return amount * IN_CM;
                    case "km": return amount * IN_KM;
                    default: System.out.print("Error"); System.exit(0);
                }
                break;
            }
            case "ft": {
                switch (destination) {
                    case "in": return amount * (1/IN_FT);
                    case "ft": return amount;
                    case "mi": return amount * FT_MI;
                    case "mm": return amount * FT_MM;
                    case "cm": return amount * FT_CM;
                    case "km": return amount * FT_KM;
                    default: System.out.print("Error"); System.exit(0);
                }
                break;
            }
            case "mi": {
                switch (destination) {
                    case "in": return amount * (1/IN_MI);
                    case "ft": return amount * (1/FT_MI);
                    case "mi": return amount;
                    case "mm": return amount * MI_MM;
                    case "cm": return amount * MI_CM;
                    case "km": return amount * MI_KM;
                    default: System.out.print("Error"); System.exit(0);
                }
                break;
            }
            case "mm": {
                switch (destination) {
                    case "in": return amount * (1/IN_MM);
                    case "ft": return amount * (1/FT_MM);
                    case "mi": return amount * (1/ MI_MM);
                    case "mm": return amount;
                    case "cm": return amount * MM_CM;
                    case "km": return amount * MM_KM;
                    default: System.out.print("Error"); System.exit(0);
                }
                break;
            }
            case "cm": {
                switch (destination) {
                    case "in": return amount * (1/IN_CM);
                    case "ft": return amount * (1/FT_CM);
                    case "mi": return amount * (1/MI_CM);
                    case "mm": return amount * (1/MM_CM);
                    case "cm": return amount;
                    case "km": return amount * CM_KM;
                    default: System.out.print("Error"); System.exit(0);
                }
                break;
            }
            case "km": {
                switch (destination) {
                    case "in": return amount * (1/IN_KM);
                    case "ft": return amount * (1/FT_KM);
                    case "mi": return amount * (1/MI_KM);
                    case "mm": return amount * (1/MM_KM);
                    case "cm": return amount * (1/CM_KM);
                    case "km": return amount;
                    default: System.out.print("Error"); System.exit(0);
                }
                break;
            }
            default:
                System.out.print("Error"); System.exit(0);
        }
        System.exit(0);
        return 0;
    }
    public String origin;
    public String destination;
    public double amount;
    public double IN_FT = 0.0833333;
    public double IN_MI = 0.000015783;
    public double IN_MM = 25.400276352;
    public double IN_CM = 2.5400276352;
    public double IN_KM = 0.0000254;
    public double FT_MI = 0.0001893939;
    public double FT_MM = 304.8;
    public double FT_CM = 30.48;
    public double FT_KM = 0.0003048;
    public double MI_MM = 1609344;
    public double MI_CM = 160934.4;
    public double MI_KM = 1.609344;
    public double MM_CM = 0.1;
    public double MM_KM = 0.000001;
    public double CM_KM = 0.00001;
}