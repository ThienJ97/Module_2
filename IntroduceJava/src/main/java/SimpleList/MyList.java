package SimpleList;

import java.util.Arrays;

public class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object elements[];

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }
        // khởi tạo phương thức ensureCapa()
        // dùng để kiểm tra độ dài mảng và tăng gấp đôi mảng đó lên 2 lần
        private void ensureCapa() {
                int newSize = elements.length * 2;
                elements = Arrays.copyOf(elements, newSize);
        }
        //khởi tạo phương thức add(E e) với đối số e kiểu E
        //E đại diện cho kiểu dữ liệu của phần tử được thêm vào danh sách
        //Phương thức add(E e) dùng để kiểm tra độ dài của mảng đến mức tối đa
        // và sau đó sẽ gọi đến phương thức ensureCapa() đề tăng kích thước lên 2 lần.
        public void add(E e) {
                if (size == elements.length) {
                        ensureCapa();
                }
                elements[size++] = e;
        }
        //Phương thức public E get(int i) có nhiệm vụ trả về phần tử ở vị trí i trong danh sách.
        //trong đo dữ liệu E chưa xác định
        public E get(int i) {
                if (i>= size || i <0) {
                        // dùng để thông báo ngoại lệ khi nhập sai vị trí và độ dài
                        throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
                }
                //ép kiểu E cho elements[i]
                return (E) elements[i];
        }
        public void remove(int index ,int num){
                for (int i = index;i<size-num;i++){
                        elements[i]=elements[i + num];
                        elements[i + num]=null;
                }

                size = size -num;
        }
        public MyList<Integer> subArr(int from,int end){
                MyList<Integer> arrNew = new MyList<>();
                for (int i = from;i<end;i++){
                        arrNew.add((Integer) elements[i]);
                }
                return arrNew;
        }

}
