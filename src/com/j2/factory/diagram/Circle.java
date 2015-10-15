package com.j2.factory.diagram;

public class Circle extends Figure {
    FigureTypeFactory typeFactory;
 
    public Circle(FigureTypeFactory typeFactory) {
        this.typeFactory = typeFactory;
    }
    void prepare() {
        System.out.println("Setting " + name);
        shade = typeFactory.createShade();
        regularity = typeFactory.createRegularity();
    }
}
