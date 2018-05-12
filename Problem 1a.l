%{
#include<stdio.h>
int no;
%}
%%
[a-z] {printf("Is a Small Letter");} 
[A-Z] {printf("Is a capital Letter");}
[0-9] {no++;}
%% 
int yywrap()
{
return 1;
}

main()
{
printf("Enter a Character");
printf("Enter a no & Enter id");
yylex();
printf("No of digits=%d",no);
}

