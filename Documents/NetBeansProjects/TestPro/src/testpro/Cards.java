/* CS 2365 OOP Spring 2020
Mihir Patel 
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpro;

/**
 *
 * @author Mihir
 */
public class Cards {
  enum Color{
      Red, Blue, Green, Yellow, Wild;
      
        private static final Color[] colors = Color.values();
        public static Color  getcolor(int i)
        {
            return Color.colors[i];
        }
  }
  enum Value
  {
      Zero, one, two, three, four, five, six, seven, eight, nine, Drawtwo, skip, reverse ,Wild, Wild_four;
      
        private static final Value[] values = Value.values();
        public static Value getValue(int i)
        {
            return Value.values[i];
        }
  }
  private final Color color;
  private final Value value;
  
  public Cards(final Color color, final Value value)
  {
      this.color = color;
      this.value = value;
  }
  
  public Color getColor()
  {
      return this.color;
  }
  
  public Value getValue()
  {
      return this.value;
  }
  public String toString()
  {
      return color + "_" + value;
  }
}

