package kurs.Java.Alkochole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlcoholCounter {
    private String title;
    private Double strength;
    private static final float etchingFactorWomen=0.6f;
    private static final float etchingFactorMen=0.7f;
    private  static  final int burningAlcoholForMenHour=11;
    private  static  final int burningAlcoholForWomenHour=9;

    public float calculatePerMil(Double quantity, Double weight, boolean male, Alkohol alkohol) {
        float proMil = 0;
        if (male) {
            proMil = (float) ( quantity / etchingFactorMen/ weight * alkohol.getStrenght());
        } else {
            proMil = (float) ( quantity / etchingFactorWomen / weight * alkohol.getStrenght());
        }
        return proMil;
    }

    public float calculatePermilWithHours(int quantity, int weight, boolean male, double hours) {
        float proMil = 0;
        if (male) {
            proMil = (float) ((float) ((quantity * strength) - burningAlcoholForMenHour * hours) / (etchingFactorMen * weight));
        } else {
            proMil = (float) ((float) ((quantity * strength) - burningAlcoholForWomenHour * hours) / (etchingFactorWomen * weight));
        }
        return proMil;
    }


}