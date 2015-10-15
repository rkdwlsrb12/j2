package com.j2.factory.diagram;

public class Triangle extends Figure {
    FigureTypeFactory typeFactory;
 
    public Triangle(FigureTypeFactory typeFactory) {
        this.typeFactory = typeFactory;
    }
    void prepare() {
        System.out.println("Setting " + name);
        shade = typeFactory.createShade();
        regularity = typeFactory.createRegularity();
    }
}


