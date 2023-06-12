package Year2023.Task38_OOP_Collections.employees;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    // [0][1][2][3][4][5][6][7][8][9]
    public void add(String s) {
        array[size] = s;
        //[0][1][2][3][4][5][6][7][8][9] = error
        size++;

        // Check array and * 2
        // [0][1][2][3][4][5][6][7][8][9][10][11][12][13][14][15][16][17][18][19]
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    // When we want delete index
    // For Example, we want delete index 1
    // [delete][1][2][3][4][5][6][7][8][9]
    public void remove(int index) {
        if(index >=0 && index < size) {

            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }
    public String get(int index) {
        if(index >=0 && index < size) {
            return array[index];
        } else {
            return "Element don't found";
        }
    }
}
