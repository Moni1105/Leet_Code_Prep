class celsiusTokelvinFahrenit{
    public double[] convertTemperature(double celsius) {
       double res[]= new double[2];
       res[0]=celsius + 273.15;
       res[1]=(celsius*1.80 )+ 32.00;
        return res;
    }

    public static void main(String args[]){
        celsiusTokelvinFahrenit as= new celsiusTokelvinFahrenit();
        double[] res=as.convertTemperature(36.50);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}