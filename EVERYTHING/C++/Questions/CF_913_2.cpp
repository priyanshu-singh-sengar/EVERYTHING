#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin >> n;

    while (n--)
    {
        string str;
        cin >> str;

        string result;

        for (char c : str)
        {
            if (c == 'b' && !result.empty() && islower(result.back()))
            {
                result.pop_back(); // Remove the last lowercase letter
            }
            else if (c == 'B' && !result.empty() && isupper(result.back()))
            {
                result.pop_back(); // Remove the last uppercase letter
            }
            else if (isalpha(c))
            {
                result.push_back(c); // Add alphabetic characters to the result
            }
        }

        cout << result << endl;
    }

    return 0;
}
