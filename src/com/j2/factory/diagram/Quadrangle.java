package com.j2.factory.diagram;

public class Quadrangle extends Figure {
    FigureTypeFactory typeFactory;
 
    public Quadrangle(FigureTypeFactory typeFactory) {
        this.typeFactory = typeFactory;
    }
    void prepare() {
        System.out.println("Making " + name);
        shade = typeFactory.createShade();
        regularity = typeFactory.createRegularity();
    }
}

