            if(arr[mid]==target){
                fir_ans=mid;
                right=mid-1;
                
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else 
              left=mid+1;
                
            }
            if(fir_ans==-1) return 0;
            left=0;
            right=arr.length-1;
             while(left<=right)
        {
            mid=left+(right-left)/2;
            if(arr[mid]==target){
                last_ans=mid;
                left=mid+1;
                
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else 
              left=mid+1;
                
            }
             return last_ans-fir_ans+1;

        }
    }

