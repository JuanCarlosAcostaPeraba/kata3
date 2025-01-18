package dis.ulpgc.kata3.io;

import dis.ulpgc.kata3.model.Title;

import java.io.IOException;
import java.util.List;

public interface TitleLoader {
    List<Title> load() throws IOException;
}
