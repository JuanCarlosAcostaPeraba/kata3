package dis.ulpgc.kata3.model;

import java.util.Iterator;
import java.util.List;

public class Barchart implements Iterable<BarchartElement> {
    private final String Title;
    private final String xAxis;
    private final String yAxis;
    private final List<BarchartElement> barchartElements;

    public Barchart(String title, String xAxis, String yAxis, List<BarchartElement> barchartElements) {
        Title = title;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.barchartElements = barchartElements;
    }

    @Override
    public Iterator<BarchartElement> iterator() {
        return barchartElements.iterator();
    }

    public String getTitle() {
        return Title;
    }

    public String getxAxis() {
        return xAxis;
    }

    public String getyAxis() {
        return yAxis;
    }

    public List<BarchartElement> getBarchartElements() {
        return barchartElements;
    }
}
