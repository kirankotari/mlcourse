public class Word {
    private String value;

    public Word (String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
class Text {
    private String header;
    private String body = " ";
    private String value = " ";

    public Text(Word word) {
        header = word.getValue();
    }
    public Text(Phrase phrase) {
        header = phrase.getValue();
    }
    public void addValue(Word word) {
        value += " " + word.getValue();
    }
    public void addBody(Phrase phrase) {
        body += " " + phrase.getValue();
    }
    public String getBody() {
        return body;
    }
}
class Phrase {
    private String value = " ";

    public void addValue(Word word) {
        value += " " + word.getValue();
    }
    public String getValue() {
        return value;
    }
}
class RunFile {
    public static void main(String[] args) {
        Word word = new Word("Sashagfdgdfgfdgfdg");
        Word word1 = new Word("dsadewdqdqwdwq");
        Word word2 = new Word("kekekekekekekek");
        Phrase phrase = new Phrase();
        Text text = new Text(word);
        text.addValue(word);
        phrase.addValue(word1);
        phrase.addValue(word2);
        text.addBody(phrase);
        System.out.println(text.getBody());
    }
}