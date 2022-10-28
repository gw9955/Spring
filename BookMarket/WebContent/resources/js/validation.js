function checkAddProduct(){
   let regExpId = /^ISBN[0-9]{1,8}$/;
   
   /*var unitPrice = document.getElementById("unitPrice");*/
    
   let form = document.newBook;
    
   let bookId = form.bookId.value; //도서 코드
   let name = form.name.value;//도서명
   let unitPrice = form.unitPrice.value;
   let unitsInStock = form.unitsInStock.value;
   
   
   
    if(!regExpId.test(bookId)){
        alert("도서코드는 ISBN로 시작하고 5~12자로 해주세요!");
        form.bookId.select();
        return; 
    }
   
      else if(name.length <4 || name.length >12){
         alert("도서명은 12자까지 입력해주세요!");
         return false;
      }
      
      else if(unitPrice.length == 0 || isNaN(unitPrice)){
         alert("가격은 숫자만 입력하세요!"); 
         return false;
      }
      
      else if(unitPrice < 0){
         alert("가격은 음수를 입력할 수 없습니다.");
         return false;
      }
      else if(isNaN(unitsInStock)){
         alert("재고수는 숫자만 입력하세요.");
         return false;
      }
      form.submit();
    
}