#!/bin/bash
#Fibonacci
clear
N=$1
a=0
b=1

echo "La serie de fibonacci es: "
for((i=0; i<N ; i++ ))
do
    echo -n "$a "
    fn=$((a+b))
    a=$b
    b=$fn
done
echo " "


