

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
      data: { boardNo: boardNo, loginUserNo: loginUserNo },
      success: function (response) {
          
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
     dataType : "JSON",
      data: { boardNo: boardNo, loginUserNo: loginUserNo },
      success: function (response) {
        var WriteUserResult = response.WriteUserResult;
        if(WriteUserResult > 0){
             Swal.fire({
            title: "BandArchive",
            text: '자신의 글은 좋아요를 할수없습니다!',
            icon: 'warning',
        });
          
        }else{
           alert(WriteUserResult);
alert("loginUserNo = " + loginUserNo,"boardNo" + boardNo,"userNo" + userNo);
          location.reload()
        

        }
        
      },
      
      error: function (request, status, error) {
        console.log("addLike AJAX 에러 발생");
        console.log("상태코드 : " + request.status);

      },
    });
  } // else끝
}
const commentBox2 = () => {
  if (heart.classList.contains("like")) {
    heart.classList.remove("like");
    heart.classList.add("unlike");
  } else {
    heart.classList.remove("unlike");
    heart.classList.add("like");
  }
};
addLikeDiv.addEventListener("click", addLike);
