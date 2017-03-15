package SplitWord;

import com.hankcs.hanlp.HanLP;
import com.huaban.analysis.jieba.JiebaSegmenter;
import android.util.Log;
/**
 * Created by Alice on 2017/3/15.
 */

public class Jieba{
    public static String work(String simplefied){
        JiebaSegmenter segmenter = new JiebaSegmenter();
        String testStr = HanLP.convertToSimplifiedChinese(simplefied);
        return segmenter.process(testStr, JiebaSegmenter.SegMode.INDEX).toString();
    }
}