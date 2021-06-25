#include <stdio.h>
int main(void) {
   char niz1[20], niz2[20];
   scanf(" %*[^\n]");
   scanf(" %*[^\n]");
   scanf(" %[^#]", niz1);
   scanf("#n%s", niz2);
   printf("|%s|\n", niz1);
   printf("|%s|\n", niz2);
   printf("|%c|", getchar());
   return 0;
}