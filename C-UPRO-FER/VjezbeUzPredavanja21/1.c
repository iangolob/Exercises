#include <stdio.h>

int myStrlen(char *p) {
   int rez = 0;
   while (*(p + rez) != '\0') {
      rez++;
   }
   return rez;
}

int main(void) { printf("%d", myStrlen("Mutavac")); }