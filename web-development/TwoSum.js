/**
 * @param {number[]} numbers The array of numbers.
 * @param {number} sum The required target sum.
 * @return {number[]} An array of 2 indices. The indices of the two elements whose sum is equal to sum.
 */
function findTwoSum(numbers, sum) {
    const map = new Map();
    for (let i = 0; i < numbers.length; i++) {
        const target = sum - numbers[i];
        if (map.has(target)) {
            return [map.get(target), i];
        }

        map.set(numbers[i], i);
    }
    return null;
}

const indices = findTwoSum([3, 1, 5, 7, 5, 9], 10);
console.log(indices);