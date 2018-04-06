package at.refugeescode.mp11piratesofthecodebean3.logic;

abstract class CsvParserModule<T> {

    private String path;

    CsvParserModule(String path) {
        this.path = path;
    }

    String getPath() {
        return path;
    }

    abstract boolean isValid(String[] columns);

        abstract T toObject(String[] columns);


}
