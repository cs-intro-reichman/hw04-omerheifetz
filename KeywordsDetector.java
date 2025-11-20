public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String [] sentencesLC = new String [sentences.length];
        String [] keywordsLC = new String [keywords.length];
        for (int i=0; i<sentencesLC.length; i++) { // LowerCase every char in first array and put into new array
            String sentenceLowered = sentences [i].toLowerCase();
            sentencesLC [i] = sentenceLowered;
        }
        for (int i=0; i<keywords.length; i++) { // LowerCase every char in second array and put into new array
            String keywordLowered = keywords [i].toLowerCase();
            keywordsLC [i] = keywordLowered;
        }

        for (int i=0; i<sentencesLC.length; i++) {
            for (int j=0; j< keywordsLC.length; j++) {
                if (sentencesLC[i].contains(keywordsLC[j])) {
                    System.out.println(sentences [i]);
                    break;
                }
            }
        }
    }
}
