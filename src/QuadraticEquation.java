public class QuadraticEquation {
    private double coefficientA,coefficientB,coefficientC;
    public void setCoefficient(double coefficientA,double coefficientB,double coefficientC){
         this.coefficientA=coefficientA;
         this.coefficientB=coefficientB;
         this.coefficientC=coefficientC;
    }
    public double getCoefficientA(){
        return this.coefficientA;
    }
    public double getCoefficientB(){
        return this.coefficientB;
    }
    public double getCoefficientC(){
        return this.coefficientC;
    }
    public double getDiscriminant(){
        double delta=0;
        delta=coefficientB*2 -4*coefficientA*coefficientC;
        return delta;
    }
    public double getRoot1(double delta){
        double root1=(-coefficientB+Math.pow(delta,0.5))/2*coefficientA;
        return root1;
    }
    public double getRoot2(double delta){
        double root2=(-coefficientB-Math.pow(delta,0.5))/2*coefficientA;
        return root2;
    }
}
