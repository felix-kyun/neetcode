class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        var cars = new long[position.length];
        for (int i = 0; i < position.length; i++) {
            cars[i] = ((long)position[i] << 32) | i;
        }
        Arrays.sort(cars);

        double currentTime = -1;
        int fleets = 0;
        for (int i = cars.length - 1; i >= 0; i--) {
            int current = (int)(cars[i]);
            double time = (double)(target - position[current]) / speed[current];
            if (time > currentTime) {
                fleets++;
                currentTime = time;
            }
        }

        return fleets;
    }
}
