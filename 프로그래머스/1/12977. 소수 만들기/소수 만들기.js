function solution(nums) {
  let answer = 0; // 서로 다른 3개의 수를 더했을 때 소수가 되는 경우의 수

  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      for (let k = j + 1; k < nums.length; k++) {
        // 서로 다른 3개 수의 합
        let sum = nums[i] + nums[j] + nums[k];

        // 소수 판별하기
        if (isPrime(sum)) answer++;
      }
    }
  }
  return answer;
}

// 소수 판별하기
const isPrime = (sum) => {
  for (let i = 2; i < sum; i++) {
    if (sum % i === 0) return false;
  }
  return true;
};