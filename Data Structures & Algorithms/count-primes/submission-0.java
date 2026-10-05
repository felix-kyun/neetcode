class Solution {
	public int countPrimes(int limit) {
		int count = 0;
		var isComposite = new boolean[limit];

		// marking
		for (int i = 2; i * i < limit; i++) {
			if (!isComposite[i]) {
				for (int j = i * i; j < limit; j += i) {
					isComposite[j] = true;
				}
			}
		}

		// collection
		for (int i = 2; i < limit; i++) {
			if (!isComposite[i]) {
				count++;
			}
		}

		return count;
	}
}