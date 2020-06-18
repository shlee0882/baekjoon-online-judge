    public int[] solution(int[] arr) {
        int current, next =0;
        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list1.add(arr[i]);
        }

        int i = 0;
        while(true) {
            current = list1.get(i);
            if (i + 1 < list1.size()) {
                next = list1.get(i + 1);
                if (current == next) {
                    list1.remove(i+1);
                    i=0;
                }else{
                    i++;
                }
            }else{
                break;
            }
        }

        int[] answer = new int[list1.size()];

        for(int j=0; j<list1.size(); j++){
            answer[j] = list1.get(j);        
        }
        return answer;
    }