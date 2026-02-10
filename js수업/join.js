//스크립트의 위치가 body태그 위 에 있는경우에
//태크를 가져와서 사용해야 한다면
// 반드시 window가 load 한다음에
//태그 가져오기를 해야 한다.

window.onload=function(){
    //가입 버튼 클릭시
    //필수 정보가 모두 입력되었는가 확인하기
    // 비밀번호와 비밀번호확인이 일치하는가
    let id= document.getElementById("userId");
    let pw= document.getElementById("userPw");
    let pw2= document.getElementById("userPwRe");
    let name= document.getElementById("name");
    let tel= document.getElementById("tel");

    id.addEventListener("keyup", joinCheck);
    pw.addEventListener("keyup", joinCheck);
    pw2.addEventListener("keyup", joinCheck);
    name.addEventListener("keyup", joinCheck);
    tel.addEventListener("keyup", joinCheck);
}
// 만약에 이름을 입력 안했을경우에 사용자에게 알려주고 싶다면
// 지금과 같은 방식은 어렵다(불가능은 아님)
function joinCheck(){

}