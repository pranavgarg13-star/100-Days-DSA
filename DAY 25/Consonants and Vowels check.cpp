void checkString(string s) {
    int v = 0;  
    int con = 0;  

    for (char ch : s) {
        if (ch == ' ') continue; 

        if (isalpha(ch)) {
            char lower = tolower(ch);
            if (lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u')
                v++;
            else
                con++;
        }
    }

    if (v > con)
        cout << "Yes";
    else if (con > v)
        cout << "No";
    else
        cout << "Same";

    cout << endl;
}
