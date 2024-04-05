const localPw = document.getElementById('floatPw');
const localId = document.getElementById('floatId');
const loginBtn = document.querySelector('loginBtn');
let BooleanloginState = false;

document.querySelector('.signupBtn').addEventListener('click',()=>{
    setUserInfo();
})