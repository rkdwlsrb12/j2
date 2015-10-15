package com.j2.factory.diagram;


public abstract class FigureSet {
	protected abstract Figure createFigure(String item);
	 
    public Figure setFigure(String type) {
        Figure figure = createFigure(type);
        System.out.println("--- Setting a " + type + " ---");
        return figure;
    }

}
