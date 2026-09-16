class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        var s = new Stack<Integer>();
        var out = new ArrayList<Integer>();

        outer:
        for (int asteroid: asteroids) {
            if (asteroid < 0) {
                int a = Math.abs(asteroid);
                while (s.size() > 0) {
                    if (s.peek() >= a) {
                        if (s.peek() == a) {
                            s.pop();
                        }
                        continue outer;
                    }
                    s.pop();
                }
                out.add(asteroid);
            } else {
                s.add(asteroid);
            }
        }

        out.addAll(s);
        
        var victors = new int[out.size()];
        for (int i = 0; i < victors.length; i++) {
            victors[i] = out.get(i);
        }

        return victors;
    }
}
