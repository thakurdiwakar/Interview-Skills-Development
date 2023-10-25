// C++ program for the above approach
#include <bits/stdc++.h>
using namespace std;

// Naive iterative solution to calculate pow(x, n)
long power(int x, unsigned n)
{
	// Initialize result to 1
	long long pow = 1;

	// Multiply x for n times
	for (int i = 0; i < n; i++) {
		pow = pow * x;
	}

	return pow;
}

// Driver code
int main(void)
{

	int x = 2;
	unsigned n = 3;

	// Function call
	int result = power(x, n);
	cout << result << endl;

	return 0;
}