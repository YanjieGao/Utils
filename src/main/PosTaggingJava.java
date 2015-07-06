import edu.stanford.nlp.tagger.maxent.MaxentTagger;

/**
 * Created by jiangdantong on 2015/7/5.
 */
public class PosTaggingJava {

    public static void main(String [] args)
    {
        String a = "I like watching movies";
        MaxentTagger tagger =  new MaxentTagger("lib/tagger/taggers/english-left3words-distsim.tagger");
        String tagged = tagger.tagString(a);
        System.out.println(tagged);
    }

}
