const commentBox2 = () => {
  if (heart.classList.contains("like")) {
    heart.classList.remove("like");
    heart.classList.add("unlike");
  } else {
    heart.classList.remove("unlike");
    heart.classList.add("like");
  }
};

const addLikeDiv = document.getElementById("addLike");

function addLike() {
  let boardNo = document.getElementById("boardNo").value;
  let userNo = document.getElementById("userNo").value;
  let loginUserNo = document.getElementById("loginUserNo").value;
  let like_Check = document.getElementById("like_Check");
  let likeck = document.getElementById("likeck");

  if (likeck.value == "T") {
    console.log("TTTTTTT");
     $.ajax({
      url: "removeLike",
      method: "POST",
      data: { boardNo: boardNo, userNo: userNo, loginUserNo: loginUserNo },
      success: function () {
          console.log("삭제요청이 성공적으로 처리되었습니다.");
          likeck.value = "F";
        location.reload()
      },
      error: function (request, status, error) {
        console.log("removeLike AJAX 에러 발생");
        console.log("상태코드 : " + request.status);
      },
    });
  } // if 끝
    else {
    console.log("FFFFFF NOTHING");
    $.ajax({
      url: "addLike",
      method: "POST",
    
      data: { boardNo: boardNo, userNo: userNo, loginUserNo: loginUserNo },
      success: function () {
        console.log("요청이 성공적으로 처리되었습니다.");
         location.reload()
      },
      
      error: function (request, status, error) {
        console.log("addLike AJAX 에러 발생");
        console.log("상태코드 : " + request.status);

      },
    });
  } // else끝
}

addLikeDiv.addEventListener("click", addLike);
