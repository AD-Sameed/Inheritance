class VandC {
    private String str;

    public VandC(String str) {
        this.str = str.toLowerCase();
    }

    public int vovel() {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }

    public int consonant() {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) count++;
        }
        return count;
    }

}
