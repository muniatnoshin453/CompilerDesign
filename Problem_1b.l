%{
#include<stdio.h>
int vowel=0;
int cons=0;
%}
%%
"a"|"e"|"i"|"o"|"u"|"A"|"E"|"I"|"O"|"U" {printf("is a VOWEL");vowel++;}
[a-zA-z] {printf("Is a Consonant");cons++;}
%%
int yywrap()
{
return 1;
}
main()
{
printf("Enter String\n");
yylex();
printf("vowel=%d and Consonent=%d",vowel,cons);
}
