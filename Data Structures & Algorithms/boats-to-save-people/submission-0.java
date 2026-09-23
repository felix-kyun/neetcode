class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int boats = 0;
        int a = 0, b = people.length;
        while (a < b) {
            if (people[a] + people[b - 1] > limit) {
                b--;   
            } else {
                a++;
                b--;
            }
            boats++;
        }

        return boats;
    }
}