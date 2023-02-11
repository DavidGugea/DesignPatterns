package StructuralDesignPatterns.Decorator.decorators;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);

        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);

        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return new String(buffer);
    }
}
