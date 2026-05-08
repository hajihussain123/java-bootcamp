package com.tw.bootcamp.problem3.domain;

public class Volume {
    private final double volume;
    private final VolumeUnit volumeUnit;

    public Volume(double volume, VolumeUnit volumeUnit) {
        this.volume = volume;
        this.volumeUnit = volumeUnit;
    }

    public static Volume create(double volume,VolumeUnit volumeUnit) {
        return new Volume(volume, volumeUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume1)) return false;
        return Double.compare(volumeUnit.conversionFactor * volume, volume1.volumeUnit.conversionFactor * volume1.volume) == 0;
    }
}
