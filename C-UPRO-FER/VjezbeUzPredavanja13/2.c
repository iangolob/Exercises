#include <stdio.h>

int jestVelikoSlovo(char x) { return x >= 'A' && x <= 'Z'; }

int main(void) {
   char c;
   scanf("%c", &c);
   printf("%d", jestVelikoSlovo(c));
}