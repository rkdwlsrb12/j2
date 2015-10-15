package com.j2.factory.diagram;

public class AbnormalFigureSet extends FigureSet {
    protected Figure createFigure(String item) {
    	Figure figure = null;
        FigureTypeFactory typeFactory=new AbnormalFigureTypeFactory();
        if (item.equals("abnormal triangle")) {
            figure = new Triangle(typeFactory);
            figure.setName("Shaded Irregular Triangle");
        }
      
        else if (item.equals("abnormal circle")) {
            figure = new Circle(typeFactory);
            figure.setName("Shaded Eclipse");
        }
        

    	else if (item.equals("abnormal quadrangle")) {
            figure = new Quadrangle(typeFactory);
            figure.setName("Shaded Irregular Quadrangle");
        }
      
        return figure;
    }
}