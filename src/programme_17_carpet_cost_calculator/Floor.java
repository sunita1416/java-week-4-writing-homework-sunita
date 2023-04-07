package programme_17_carpet_cost_calculator;

/**
 * 1. Write a class with the name Floor. The class needs two fields (instance variables)
 * with name width and lenght of type double.
 * The class needs to have one constructor with paraeters width and length of type doubl and it nees to initialize
 * the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the
 * length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * Method names getArea without any parameters, it needs to return the calculated area(with * length).
 */
public class Floor {
    double width;
    double length;

    public Floor(double width, double length){
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }
}
