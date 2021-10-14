
package kata03_42;

import java.util.HashMap;
import java.util.Map;


public class Kata03_42 {

   
    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        
        new HistogramDisplay(histogram).execute();
        
    }
    
}
