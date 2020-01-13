enum Temperature {
    KELVIN,
    CELSIUS,
    FAHRENHEIT,
    RANKINE,
    DESILE,
    NEWTON,
    REAUMUR,
    ROMER
}

public class UnitConvertion {
	public static void main(String[] args) {
        System.out.println("Unit Converter");
        System.out.println("Mau konversi dari?");
        show_all_temperatures();
	};

	public static void show_all_temperatures() {
        int i = 0;

        for(Temperature temp : Temperature.values()) {
            i++;
            System.out.println(i + ". " + temp);
        }
    }

    public static double convert_temperature_unit(double value, Temperature from,
                                                  Temperature to) {
        double result = 0;

        if(from == to) {
            result = value;
        } else {
            switch(from) {
            case KELVIN:
                result = value;
                break;
            case CELSIUS:
                result = value + 273.25;
                break;
            case FAHRENHEIT:
                result = (value + 459.67) * 5 / 9;
                break;
            case RANKINE:
                result = value * 5 / 9;
                break;
            case DESILE:
                result = 373.15 - (value * 2 / 3);
                break;
            case NEWTON:
                result = (value * 100 / 33) + 273.15;
                break;
            case REAUMUR:
                result = (value * 5 / 4) + 273.15;
                break;
            case ROMER:
                result = ((value - 7.5) * 40 / 21) + 273.15;
                break;
            }

            switch(to) {
            case CELSIUS:
                result = result - 273.15;
                break;
            case FAHRENHEIT:
                result = (result * 9 / 5) - 459.67;
                break;
            case RANKINE:
                result = result * 9 / 5;
                break;
            case DESILE:
                result = (373.15 - result) * 3 / 2;
                break;
            case NEWTON:
                result = (result - 273.25) * 33 / 100;
                break;
            case REAUMUR:
                result = (result - 273.15) * 4 / 5;
                break;
            case ROMER:
                result = ((result - 273.15) * 21 / 40) + 7/5;
                break;
            }
        }

        return result;
    }
}