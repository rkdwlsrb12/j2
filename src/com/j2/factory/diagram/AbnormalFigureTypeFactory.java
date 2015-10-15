package com.j2.factory.diagram;

public class AbnormalFigureTypeFactory implements FigureTypeFactory {
    public Regularity createRegularity() {
        return new Irregular();
    }
    public Shade createShade() {
        return new Shaded();
    }
    
}