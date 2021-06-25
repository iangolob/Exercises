#include <stdio.h>
int main(void) {
   char niz1[20], niz2[20], niz3[20];
   scanf("%[^\n]", niz1);
   scanf("%s", niz2);
   scanf("%[^123]", &niz3[0]);
   printf("|%s|\n", niz1);
   printf("|%s|\n", niz2);
   printf("|%s|\n", niz3);
   printf("|%c|", getchar());
   return 0;
}