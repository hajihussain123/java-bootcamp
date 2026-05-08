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
        if (!(o instanceof Volume that)) return false;
        return Math.abs(this.volumeUnit.toStandard(this.volume) - that.volumeUnit.toStandard(that.volume)) <= 0.1;
    }

    public Volume add(Volume other) {
        return new Volume(this.volumeUnit.toStandard(this.volume) + other.volumeUnit.toStandard(other.volume), VolumeUnit.LITRE);
    }
}
