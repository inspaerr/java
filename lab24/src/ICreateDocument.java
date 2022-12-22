import java.io.FileNotFoundException;

public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(String path) throws FileNotFoundException;
}