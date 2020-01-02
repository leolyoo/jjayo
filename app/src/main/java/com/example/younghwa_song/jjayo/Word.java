package com.example.younghwa_song.jjayo;

import java.util.Objects;

public class Word {
    private String character;
    private String pronunciation;
    private String meaning;
    private boolean isSelect;

    Word(String character, String pronunciation, String meaning) {
        this.character = character;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
    }
    Word(String character, String pronunciation, String meaning, boolean isSelect) {
        this.character = character;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
        this.isSelect = isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public boolean getSelect() {
        return isSelect;
    }

    String getCharacter() {
        return character;
    }

    String getPronunciation() {
        return pronunciation;
    }

    String getMeaning() {
        return meaning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word that = (Word) o;
        return Objects.equals(character, that.character) &&
                Objects.equals(pronunciation, that.pronunciation) &&
                Objects.equals(meaning, that.meaning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, pronunciation, meaning);
    }
}
