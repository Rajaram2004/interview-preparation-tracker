class Solution {
    public int maximumPopulation(int[][] logs) {
        int population[]=new int[2051];
        int currentpopulation=0,maxpopulation=0,year=1950;
        for(int log[] : logs){
            population[log[0]]++;
        population[log[1]]--;
        }

       for(int i=1950;i<2051;i++){
            currentpopulation+=population[i];
            if(currentpopulation > maxpopulation){
                maxpopulation=currentpopulation;
                year=i;
            }
        }
    return year;
    }
}
