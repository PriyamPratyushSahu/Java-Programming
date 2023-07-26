package _2_Numbers;
//[(int) Math.round(Math.random() * 10)
class Arrays{
    public static void main(String args[]){
        //Single dimension Array
        int arr[] = new int[1 + (int) Math.round(Math.random() * 20)];
        System.out.format("1D Array Size: [%d]\n", arr.length);
        for(int i =0; i < arr.length; i++){
            arr[i] = (int) Math.round(Math.random() * 100);
            System.out.print(arr[i] + " , ");
        }

        //Two dimension Array
        int arr2[][];
        int row,col;
        row = 1 + (int) Math.round(Math.random() * 10);
        col = 1 + (int) Math.round(Math.random() * 20);
         arr2 = new int[row] [col];
        System.out.format("\n\n2D Array Size: [%d][%d]\n Rows: %d\nColumns: %d\n", arr2.length,arr2[0].length,row,col);
         for(int i = 0; i < arr2.length; i++){ //row size -> arr2.length
             
             for(int j = 0; j < arr2[0].length; j++){ //column size -> arr2[0].length
                arr2[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(arr2[i][j] + "  ");
             }
             System.out.println();
        }
    }
}

/*
************************** OUTPUT **************************
1D Array Size: [20]
73 , 6 , 38 , 56 , 57 , 84 , 10 , 2 , 78 , 81 , 87 , 34 , 70 , 57 , 2 , 20 , 41 , 13 , 57 , 71 ,

2D Array Size: [6][8]
 Rows: 6
Columns: 8
16  37  92  97  48  43  42  48
3  3  6  61  26  91  21  59
18  38  89  77  78  14  84  31
45  98  42  12  30  2  48  51
92  90  89  64  94  57  88  79
49  96  46  78  56  15  7  26

1D Array Size: [17]
26 , 23 , 68 , 9 , 36 , 40 , 76 , 97 , 20 , 88 , 31 , 39 , 97 , 60 , 77 , 93 , 39 ,

2D Array Size: [2][18]
 Rows: 2
Columns: 18
80  5  88  76  92  41  20  74  69  56  18  22  60  68  12  60  59  97
13  92  72  76  8  54  42  65  85  9  63  14  67  47  13  69  18  89
 */