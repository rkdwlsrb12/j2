package com.j2.factory.diagram;

public class NormalFigureSet extends FigureSet {
    protected Figure createFigure(String item) {
    	Figure figure = null;
        FigureTypeFactory typeFactory=new NormalFigureTypeFactory();
        if (item.equals("normal triangle")) {
            figure = new Triangle(typeFactory);
            figure.setName("Unshaded Equilarteral Triangle");
        }
      
        else if (item.equals("normal circle")) {
            figure = new Circle(typeFactory);
            figure.setName("Unshaded Circle");
        }
        

    	else if (item.equals("normal quadrangle")) {
            figure = new Quadrangle(typeFactory);
            figure.setName("Unshaded Square");
        }
      
        
        return figure;
    }
}