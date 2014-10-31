#!/bin/bash

read x
read y
read z

if [[ $x -eq $y ]]; then
  if [[ $x -eq $z ]]; then
    echo "EQUILATERAL"
  else
    echo "ISOSCELES"
  fi
else 
  echo "SCALENE"
fi

exit $?