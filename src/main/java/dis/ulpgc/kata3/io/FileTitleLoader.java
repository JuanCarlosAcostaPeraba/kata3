package dis.ulpgc.kata3.io;

import dis.ulpgc.kata3.model.Title;
import dis.ulpgc.kata3.model.TitleDeserializer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTitleLoader implements TitleLoader{

    private final File file;
    private final TitleDeserializer deserializer;

    public FileTitleLoader(File file, TitleDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    @Override
    public List<Title> load() throws IOException {
        List<Title> titles = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                titles.add(deserializer.deserialize(line));
            }
        }
        return titles;
    }
}
