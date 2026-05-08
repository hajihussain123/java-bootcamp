package com.tw.bootcamp.problem3.domain;

public class Volume {
    private final double volume;
    private final VolumeUnit volumeUnit;

    public Volume(double volume, VolumeUnit volumeUnit) {
        this.volume = volume;
        this.volumeUnit = volumeUnit;
    }

    public static Volume create(double volume, VolumeUnit volumeUnit) {
        return new Volume(volume, volumeUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume1)) return false;
        return Math.abs(convertValueToLitre() - volume1.convertValueToLitre()) <= 0.1;
    }

    private double convertValueToLitre() {
        return this.volumeUnit.conversionFactor * this.volume;
    }

    public Volume add(Volume other) {
        return new Volume(convertValueToLitre() + other.convertValueToLitre(), VolumeUnit.LITRE);
    }
}
