import java.util.TreeMap;

public class Text {

    private String subject;
    private String style;
    private String genre;
    private String [] wordsList;
    private String [] stemssList;
    private String [] uniqueWordsList;
    private String [] uniqueStemssList;
    private TreeMap<String, Integer> wordsFrequency;
    private TreeMap<String, Integer> stemsFrequency;


    private int getTextSizeInCharacters (){
        return 0;
    }
    private int getTextSizeInWords (){
        return 0;
    }
    private int getTextSizeInSentences (){
        return 0;
    }

    private String [] getExamplesFromText (String phraseToPhind){

        String foundExamples [] = null;

        return foundExamples;
    }
}

//echo "# TexPeer2020" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git remote add origin https://github.com/Ceprey2/TexPeer2020.git
//        git push -u origin master

//…or push an existing repository from the command line
//
//        git remote add origin https://github.com/Ceprey2/TexPeer2020.git
//        git push -u origin master
