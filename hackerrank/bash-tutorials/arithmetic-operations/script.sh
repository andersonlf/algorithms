#!/bin/bash

read expression

#echo "scale=3; $expression" | bc -l

echo `expr $expression`

exit $?