<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <title>홈페이지 </title>

    <style>
        main{
             height: 1000px;
        }
        div{
            border: 1px solid black;
        }
        .hh{
            height: 50px;
            background-color: skyblue;  
        }
        .nh{
            height: 900px;
            margin-top: 30px;
            margin-left: 10px;
        }
        .fh{
            height:
        }
        .menu >.right{
            margin-left: auto;
        }
        .menu >.right ~.right{
            margin-left: 0.5em;
        }
        .menu-fixed{
            left: 0;
            right: 0;
            top: 0;
            padding: 10px;
            display: flex;
        }
        .menu>*{
            font-size: 1em;
            color: black;
            text-decoration: none;
        }
        
        .selebar{
            width:80px;
            height: 50px;
        }
        .centerdiv{
            text-align: center;
    
        }
        .searchbar{
            width:200px;
            height:50px;
        }
        .buttonsize{
            width:80px;
            height: 50px;
        }
        .footdiv{
            display: block;

        }
        
        .row{
            margin-top: 10px;
        }
        .rowheight{
            height: 200px;
        }

        
    </style>
</head>

<body>
    <main>
        <header>
            <article class="hh">
                <div class= "hh menu menu-fixed">
                    <img src="image/pen4.jpg" class="left">
                    <a href="" class="right"></a>
                    <a href="" class="right">예약내역</a>
                    <a href="" class="right">회원가입</a>
                    <a href="" class="right">로그인</a>
                </div>
            </article>
        </header>

        <nav>
            <article class="nh">
                <div class="centerdiv">
                    <select class="selebar">
                        <option>전체</option>
                        <option>호텔</option>
                        <option>모텔</option>
                        <option>리조트</option>
                    </select>
                    <select class="selebar">
                        <option>전체</option>
                        <option>서울</option>
                        <option>경기</option>
                        <option>충남</option>
                        <option>충북</option>
                        <option>전북</option>
                        <option>전남</option>
                        <option>대구</option>
                        <option>대전</option>
                        <option>부산</option>
                    </select>
                    <input type="text" class="searchbar">
                    <input type="submit" value="검색" class="buttonsize">
                </div>
                <div class="centerdiv row">
                    <h2>dd</h2>
                </div>
                <div class="centerdiv row">
                    <img src="http://placehold.it/600x400">
                </div>
                <div class="centerdiv row rowheight">
                    <h1>공간</h1>
                
                </div>
            </article>
        </nav>


        <footer>
            <article class="fh footdiv">
                <div>
                    <img src="image/pen4.jpg">
                </div>
                <div>
                    <a href="">회사소개</a>
                    <a href="">제휴광고문의</a>
                    <a href="">인재채용</a>
                    <a href="">이용약관</a>
                    <a href="">개인정보처리 방침</a>
                    <a href="">회사소개</a>
                </div>
                <div>
                    <address>
                        (주)야놀자
                        대표이사: 이수진
                        주소: 서울 강남구 테헤란로 108길 42
                        <br>
                        사업자 등록번호: 220-87-42885
                        통신판매업신고: 강남-14211호
                        관광사업자 등록번호: 제2016-31호
                        호스팅 서비스 제공자: (주)야놀자
                    </address>
                </div>
            </article>
        </footer>

    </main>
</body>

</html>