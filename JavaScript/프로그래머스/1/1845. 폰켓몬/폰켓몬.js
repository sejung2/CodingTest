function solution(nums) {
    let set = new Set(nums);
    let limit = Math.floor(nums.length / 2);
    return set.size > limit ? limit : set.size;
}
