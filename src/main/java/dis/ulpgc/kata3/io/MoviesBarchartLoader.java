package dis.ulpgc.kata3.io;

import dis.ulpgc.kata3.model.Barchart;
import dis.ulpgc.kata3.model.BarchartElement;

import java.util.List;

public class MoviesBarchartLoader implements BarchartLoader{
    private final List<BarchartElement> titlesPerYear;
    private final List<BarchartElement> titlesTypeCount;

    public MoviesBarchartLoader(List<BarchartElement> titlesPerYear, List<BarchartElement> titlesTypeCount) {
        this.titlesPerYear = titlesPerYear;
        this.titlesTypeCount = titlesTypeCount;
    }

    @Override
    public Barchart load(int id) {
        return switch (id) {
            case 0 -> loadBarchart("Titles per year", "Year", "Number of titles", titlesPerYear);
            case 1 -> loadBarchart("Titles type count", "Titles type", "Count", titlesTypeCount);
            default -> null;
        };
    }

    private Barchart loadBarchart(String titles, String xAxis, String yAxis, List<BarchartElement> barchartElements) {
        return new Barchart(titles, xAxis, yAxis, barchartElements);
    }
}
