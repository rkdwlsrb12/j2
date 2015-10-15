package com.j2.factory.diagram;



public class FigureTest {

	public static void main(String[] args) {
		FigureSet normalFigure = new NormalFigureSet();
		FigureSet abnormalFigure = new AbnormalFigureSet();
		
		
        Figure figure = normalFigure.setFigure("normal circle");
        System.out.println("Kang set a " + figure + "\n");
        figure = normalFigure.setFigure("normal triangle");
        System.out.println("Oh set a " + figure + "\n");
        figure = normalFigure.setFigure("normal quadrangle");
        System.out.println("Son set a " + figure + "\n");
		
 
        figure = abnormalFigure.setFigure("abnormal circle");
        System.out.println("Kang set a " + figure + "\n");
        figure = abnormalFigure.setFigure("abnormal triangle");
        System.out.println("Oh set a " + figure + "\n");
        figure = abnormalFigure.setFigure("abnormal quadrangle");
        System.out.println("Son set a " + figure + "\n");
        
       
 
	}
}