#include <stdio.h>

int main(void) {
   int brojUcitanih = 0;
   float zbroj = 0;

   FILE *du = fopen("brojevi.txt", "r");

   float ulaz;
   while (fscanf(du, "%f", &ulaz) == 1) {
      brojUcitanih++;
      zbroj += ulaz;
   }

   if (brojUcitanih == 0) {
      printf("Nije ucitan niti jedan broj");
   } else {
      printf("%f", zbroj / brojUcitanih);
   }

   fclose(du);
   return 0;
}