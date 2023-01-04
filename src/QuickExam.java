public class QuickExam {

    public static void main(String[] args){

        int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(array, 0, array.length -1);

        for (int i : array) {
            System.out.printf("%d ",i);
        }
    }

    public static void quickSort(int array[], int start, int end){

        if(start>=end) //원소가 1개인 경우 종료
            return;

        int pivot = start; //피벗은 첫 번째 원소
        int left = start+1;
        int right = end;

        while ( left <= right){

            //피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && array[left] <= array[pivot])
                left+=1;

            //피벗보다 작은 데이터를 찾을 때까지 반복
            while(right > start && array[right] >= array[pivot])
                right-=1;

            if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
                int tmp = array[right];
                array[right] = array[pivot];
                array[pivot] = tmp;
            }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
                int tmp = array[right];
                array[right] = array[left];
                array[left] = tmp;
            }

            //분할  이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
            quickSort(array, start, right -1);
            quickSort(array, right +1, end);
        }
    }
}
