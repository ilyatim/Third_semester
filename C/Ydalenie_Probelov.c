#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void print_no_space(char *text)
{
    char sumbol;
    for(int i = 0; text[i] != '\0'; i++)
    {
        sumbol = text[i];
        if(sumbol == 32)
        {
            for (int k = i; text[k] != '\0'; k++)
                text[k] = text[k+1];
            i--;
        }
    }
    for(int j = 0; text[j] != '\0'; j++)
    {
        printf("%c", text[j]);
    }
}
int main(void)
{
	char *text = (char*)malloc(250);

	gets(text);
    print_no_space(text);
    return 0;
}
