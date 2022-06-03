#include <iostream>
#include <vector>
#include <ctime>
using namespace std;

int main()
{
	unsigned int start_time = clock();
	cout << "Enter number:\n";
	int n;
	cin >> n;
	vector <int> a;
	a.push_back(0);
	int b = 3;
	int c = 3;
	int d = 0;
	for (int j = 1; j <= n; j++)
	{
		d += a[j-1];
		for (int i = 1; i <= 100000000; i++)
		{
			d += 2 * b + c - j;
		}
		a.push_back(d);
	}
	unsigned int end_time = clock();
	unsigned int search_time = end_time - start_time;
	cout << search_time << "ms.";
}