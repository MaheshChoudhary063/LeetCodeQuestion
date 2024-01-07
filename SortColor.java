
//Sort 0 ,1,2 
class SortColor
{
    public static void sort012(int a[], int n)
    {
        int l=0;
        int h=n-1;
        int m=0;
        int temp;
        while(m<=h){
            switch(a[m]){
                case 0:{
                    temp=a[l];
                    a[l]=a[m];
                    a[m]=temp;
                    l++;
                    m++;
                    break;
                }
                case 1:
                    m++;
                    break;
                case 2:{
                    temp=a[h];
                    a[h]=a[m];
                    a[m]=temp;
                    h--;
                    break;
                }
            }
        }
    }
}