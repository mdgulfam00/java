

/**
 * mergeSort
 */
public class document {
    static void merge(int arr[],int l,int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int i,j,k;
        for( i=0; i<n1; i++)
        {
            left[i]=arr[l+i];
        }
        for(j=0; j<n2; j++)
        {
            right[j]=arr[mid+1+j];
        }
        i=0; j=0; k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k]=left[i];
            i++;
            k++;
        }
        while(i<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int arr[],int l,int r)
    {
        if(l>=r)
            return;
        int mid= (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        merge(arr,l,mid,r);
    }
   static void showArray(int arr[],int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,7,9,5,8};
        int n=arr.length;
        System.out.println("Array before Sorting:");
        showArray(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.println("Array After sorting:");
        showArray(arr, n);   
    }
}
