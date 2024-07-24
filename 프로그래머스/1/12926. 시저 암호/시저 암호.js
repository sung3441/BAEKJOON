function solution(s, n) {
    let arr = s.split('');
    for (let i = 0; i < arr.length; i++) {
        let alpha = arr[i];
        arr[i] = alpha === ' ' ? alpha : shift(alpha, n);
    }
    
    return arr.join('');
}

function shift(alpha, num) {
    alpha = alpha.charCodeAt();
    let isSmall = false;
    if (alpha > 90) {
        alpha -= 32;
        isSmall = true;
    }
    alpha = (alpha + num > 90 ? alpha - 26 : alpha) + num;
    alpha = String.fromCharCode(alpha);
    return isSmall ? alpha.toLowerCase() : alpha;
    
}