package inheritance;

// final ở phạm vi class thì ko cho lớp con kế thừa
public  class Animal {
    // final ở phạm vi là thuộc tính: thì biến đó là hằng số và ko được sửa đổi
    protected String name = "Cu Cu";        // null

    // final ở phạm vi phương thức: ko cho phép lớp con ghi đề phương thức
    public void move(){
        System.out.println("Động vật đang di chuyển");
    }
}


/**

 class Object{
    //
    public String toString(){
        return "Package.ClassName@MAHASHCODE";      inheritance.Animal@23h689a

    }
 }
 */