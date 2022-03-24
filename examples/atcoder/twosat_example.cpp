/**
 * Problem: https://codeforces.com/problemset/problem/776/D.
 */
#include <atcoder/twosat>
#include <bits/stdc++.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);

	int rooms, switches;
	cin >> rooms >> switches;

	vector<bool> unlocked(rooms, false);
	for (int i = 0; i < rooms; ++i) {
		int s;
		cin >> s;
		unlocked[i] = (s != 0);
	}

	vector<vector<int>> controlBy(rooms, vector<int>());
	for (int i = 0; i < switches; ++i) {
		int cnt;
		cin >> cnt;
		for (int j = 0; j < cnt; ++j) {
			int r;
			cin >> r;
			r -= 1;
			controlBy[r].emplace_back(i);
		}
	}

	atcoder::two_sat ts(switches);
	for (int i = 0; i < rooms; ++i) {
		int x = controlBy[i][0];
		int y = controlBy[i][1];
		if (unlocked[i]) {
			ts.add_clause(x, true, y, false);
			ts.add_clause(x, false, y, true);
		} else {
			ts.add_clause(x, true, y, true);
			ts.add_clause(x, false, y, false);
		}
	}

	bool ok = ts.satisfiable();
	if (ok) {
		cout << "YES" << "\n";
	} else {
		cout << "NO" << "\n";
	}
	return 0;
}