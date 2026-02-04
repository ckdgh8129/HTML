// 드론영상 목록 관리
// 필요한 데이터 - 제목 날짜
// 자바에서 할일 ->클래스 (재목,날짜) , 클래스에 대한객체, 컬랙션에 저장 메서드(보내고 받고)
// DB에서 할일 -> 테이블 만들기 (자바의 클래스와 같은 형태)
// HTML에서 할일 ->**(구조만들기)** 데이터 출력할 영역을 태그로 만들고 꾸미기
//       HTML           ->         DB          ->                       자바                  
// 입력과 출력을 하기위해  ->  데이터 테이블로 정리  ->    HTML과 DB 사이에서 주고받고 하기위해 마지막 작업

package javatest;

pubilc class 드론{
    Run|Debug
    pubilc static void main(String[] args){
        ArrayList<드론영상> list = new ArrayList<>();
        
        list.add new 드론영상(제목 :"속리산 산불 감시",날짜:"2026-02-02");
        list.add new 드론영상(제목 :"계족산 산불 감시",날짜:"2026-02-01");
        list.add new 드론영상(제목 :"대전 중구 순찰",날짜: "2026-02-04");
        화면에 보내기(메서드이름) (list);
    }
    pubilc static ArrayList<드론영상> 화면에보내기(ArrayList<드론영상> list){
        return list;
    }
}





// 영상 하나더 보내서 html에 출력하기
// 영상 제목은 대전 중구 순찰, 날짜는 2026-02-04