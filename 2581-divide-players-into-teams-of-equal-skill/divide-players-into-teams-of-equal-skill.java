class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length-1;
        int sk = skill[i] + skill[j];
        long chem = 0;
        while(i < j){
            if(skill[i] + skill[j] != sk) return -1;
            chem += skill[i++] * skill[j--];
        }
        return chem;
    }
}