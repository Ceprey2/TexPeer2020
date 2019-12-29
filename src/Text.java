import java.util.Map;

public class Text {

    private String subject;
    private String style;
    private String genre;
    private String [] wordsList;
    private String [] stemsList;
    private String [] uniqueWordsList;
    private String [] uniqueStemsList;
    private Map<Word, Integer> wordsFrequency;
    private Map<String, Integer> stemsFrequency;


    private int getTextSizeInCharacters (){
        return 0;
    }

    private int getTextSizeInWords (){
        return 0;
    }

    private int getTextSizeInSentences (){
        return 0;
    }

    private Sample [] getSamplesFromText (String phraseToFind){

        Sample foundSamples [] = null;

        return foundSamples;
    }
}
