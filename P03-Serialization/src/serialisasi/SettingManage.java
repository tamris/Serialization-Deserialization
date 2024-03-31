/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.awt.Color;
import java.awt.Font;
import java.util.prefs.Preferences;

/**
 *
 * @author tamar
 */
public class SettingManage {
     private static final String FONT_NAME_KEY = "fontName";
    private static final String FONT_STYLE_KEY = "fontStyle";
    private static final String FONT_SIZE_KEY = "fontSize";
    private static final String TEXT_COLOR_KEY = "textColor";

    // Default settings
    private static final String DEFAULT_FONT_NAME = "Segoe UI";
    private static final int DEFAULT_FONT_STYLE = Font.PLAIN;
    private static int FONT_SIZE = 12;
    private static Color TEXT_COLOR = Color.BLACK;

    public static int getFONT_SIZE() {
        return FONT_SIZE;
    }

    public static void setFONT_SIZE(int FONT_SIZE) {
        SettingManage.FONT_SIZE = FONT_SIZE;
    }

    public static Color getTEXT_COLOR() {
        return TEXT_COLOR;
    }

    public static void setTEXT_COLOR(Color TEXT_COLOR) {
        SettingManage.TEXT_COLOR = TEXT_COLOR;
    }
    

    private transient Preferences preferences; // transient to exclude from serialization

    public SettingManage() {
        preferences = Preferences.userNodeForPackage(SettingManage.class);
    }

    public Font getFontSettings() {
        String fontName = preferences.get(FONT_NAME_KEY, DEFAULT_FONT_NAME);
        int fontStyle = preferences.getInt(FONT_STYLE_KEY, DEFAULT_FONT_STYLE);
        int fontSize = preferences.getInt(FONT_SIZE_KEY, FONT_SIZE);
        return new Font(fontName, fontStyle, fontSize);
    }

    public void setFontSettings(Font font) {
        preferences.put(FONT_NAME_KEY, font.getFontName());
        preferences.putInt(FONT_STYLE_KEY, font.getStyle());
        preferences.putInt(FONT_SIZE_KEY, font.getSize());
    }

    public Color getTextColor() {
        int rgb = preferences.getInt(TEXT_COLOR_KEY, TEXT_COLOR.getRGB());
        return new Color(rgb);
    }

    public void setTextColor(Color color) {
        preferences.putInt(TEXT_COLOR_KEY, color.getRGB());
    }
}
