package com.symbolplay.tria.resources;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

final class FontGenerator {
    private static final String FONT_CHARS;
    
    static {
        // add Latin Extended A and B to generated characters
        // they all fit on 1024x1024 texture without issue for 40 font size
        // less than half space is taken
        FONT_CHARS = FreeTypeFontGenerator.DEFAULT_CHARS +
                "\u0100\u0101\u0102\u0103\u0104\u0105\u0106\u0107\u0108\u0109\u010A\u010B\u010C\u010D\u010E\u010F" +
                "\u0110\u0111\u0112\u0113\u0114\u0115\u0116\u0117\u0118\u0119\u011A\u011B\u011C\u011D\u011E\u011F" +
                "\u0120\u0121\u0122\u0123\u0124\u0125\u0126\u0127\u0128\u0129\u012A\u012B\u012C\u012D\u012E\u012F" +
                "\u0130\u0131\u0132\u0133\u0134\u0135\u0136\u0137\u0138\u0139\u013A\u013B\u013C\u013D\u013E\u013F" +
                "\u0140\u0141\u0142\u0143\u0144\u0145\u0146\u0147\u0148\u0149\u014A\u014B\u014C\u014D\u014E\u014F" +
                "\u0150\u0151\u0152\u0153\u0154\u0155\u0156\u0157\u0158\u0159\u015A\u015B\u015C\u015D\u015E\u015F" +
                "\u0160\u0161\u0162\u0163\u0164\u0165\u0166\u0167\u0168\u0169\u016A\u016B\u016C\u016D\u016E\u016F" +
                "\u0170\u0171\u0172\u0173\u0174\u0175\u0176\u0177\u0178\u0179\u017A\u017B\u017C\u017D\u017E\u017F" +
                "\u0180\u0181\u0182\u0183\u0184\u0185\u0186\u0187\u0188\u0189\u018A\u018B\u018C\u018D\u018E\u018F" +
                "\u0190\u0191\u0192\u0193\u0194\u0195\u0196\u0197\u0198\u0199\u019A\u019B\u019C\u019D\u019E\u019F" +
                "\u01A0\u01A1\u01A2\u01A3\u01A4\u01A5\u01A6\u01A7\u01A8\u01A9\u01AA\u01AB\u01AC\u01AD\u01AE\u01AF" +
                "\u01B0\u01B1\u01B2\u01B3\u01B4\u01B5\u01B6\u01B7\u01B8\u01B9\u01BA\u01BB\u01BC\u01BD\u01BE\u01BF" +
                "\u01C0\u01C1\u01C2\u01C3\u01C4\u01C5\u01C6\u01C7\u01C8\u01C9\u01CA\u01CB\u01CC\u01CD\u01CE\u01CF" +
                "\u01D0\u01D1\u01D2\u01D3\u01D4\u01D5\u01D6\u01D7\u01D8\u01D9\u01DA\u01DB\u01DC\u01DD\u01DE\u01DF" +
                "\u01E0\u01E1\u01E2\u01E3\u01E4\u01E5\u01E6\u01E7\u01E8\u01E9\u01EA\u01EB\u01EC\u01ED\u01EE\u01EF" +
                "\u01F0\u01F1\u01F2\u01F3\u01F4\u01F5\u01F6\u01F7\u01F8\u01F9\u01FA\u01FB\u01FC\u01FD\u01FE\u01FF";
    }
    
    public static BitmapFont generate(int fontSize) {
        FreeTypeFontGenerator gen = new FreeTypeFontGenerator(Gdx.files.internal(ResourceNames.FONT_TTF));
        FreeTypeFontParameter params = getFreeTypeFontParameter(fontSize);
        BitmapFont font = gen.generateFont(params);
        gen.dispose();
        return font;
    }
    
    private static FreeTypeFontParameter getFreeTypeFontParameter(int fontSize) {
        FreeTypeFontParameter params = new FreeTypeFontParameter();
        params.size = fontSize;
        params.characters = FONT_CHARS;
        params.minFilter = TextureFilter.Linear;
        params.magFilter = TextureFilter.Linear;
        
        return params;
    }
}
