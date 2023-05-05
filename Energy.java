from operations.java import *;
public class Energy extends Physics {
    double kineticEnergy(float mass, float velocity) {
        return multiply(multiply(0.5 ,mass),pow2(velocity));
    }
    double potentialEnergy(int mass, getgravity, int height){
        return multiply(multiply(mass, gravity), height));
    }
    double velocity(float distance, float time){
        return divide(distance, time);
        }
    double pressure(float force, float area){
        return divide(force,area);
    }
    double momentum(float mass, float velocity){
        return multiply(mass, velocity)
        }
