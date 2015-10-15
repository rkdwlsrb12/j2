package com.j2.factory.diagram;

public class NormalFigureTypeFactory implements FigureTypeFactory {
    public Regularity createRegularity() {
        return new Regular();
    }
    public Shade createShade() {
        return new UnShaded();
    }
    
}