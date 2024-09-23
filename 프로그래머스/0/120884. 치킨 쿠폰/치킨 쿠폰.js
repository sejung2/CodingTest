function solution(chicken) {
    let coupon = 0;
    let service = 0;
    for(let i = 0; i < chicken; i++){
        coupon++;
        if(coupon % 10 == 0){
            coupon++;
            service++;
        }
    }
    return service;
}