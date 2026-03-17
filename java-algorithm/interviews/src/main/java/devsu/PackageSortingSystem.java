package devsu;

/*
Objective
Pick the packages from the heaviest to the lightest one.
Rules
You work in an automated factory that controls a robotic arm to move packages. The arm can pick packages from the conveyor belts to form a stack of packages.

The packages are sorted from the heaviest to the lightest on each of the conveyor belts. Your objective is to pick the heaviest package among the 3 conveyor belts to move it on a stack.

Implementation
Implement the method solve(weight0, weight1, weight2) that takes 3 integer arguments: weight0, weight1 and weight2. These values represent the weight of the packages available on the conveyor belts with respective index 0, 1 and 2. When a conveyor belt is empty, the value is 0.

The method must return the index of the conveyor belt that has the heaviest package. For example, if the values for weight0, weight1 and weight2 are 85, 100 and 90, then the expected answer is 1. In case of equality, any correct answer is accepted.

The method solve(weight0, weight1, weight2) will be called successively until all the conveyor belts are empty.
 */

public class PackageSortingSystem {

    public static int solve(int weight0, int weight1, int weight2) {

        int maxWeight = weight0;
        int index = 0;

        if (weight1 > maxWeight) {
            maxWeight = weight1;
            index = 1;
        }

        if (weight2 > maxWeight) {
            index = 2;
        }

        return index;

    }

    public static void main(String [] args){
        System.out.println("Test 1 (Expect 1): " + solve(85, 100, 90));
        System.out.println("Test 2 (Expect 0): " + solve(50, 10, 10));
        System.out.println("Test 3 (Expect 2): " + solve(0, 0, 10));
    }
}
