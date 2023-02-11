package StructuralDesignPatterns.Adapter.adapters;

import StructuralDesignPatterns.Adapter.round.RoundPeg;
import StructuralDesignPatterns.Adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(double radius) {
        super(radius);
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
