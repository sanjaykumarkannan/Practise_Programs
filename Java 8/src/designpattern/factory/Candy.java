
package designpattern.factory;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class Candy {
        
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
    
}
