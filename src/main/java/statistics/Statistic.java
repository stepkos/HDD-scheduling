package statistics;

public class Statistic {
    private final String algorithmName;
    private int seekTime = 0;
    private int breakTime = 0;
    private int starvedRealTimeTasks = 0;
    private int maxWaitingTime = 0;

    public Statistic(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public int getSeekTime() {
        return seekTime;
    }

    public void setSeekTime(int seekTime) {
        this.seekTime = seekTime;
    }

    public int getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }

    public int getStarvedRealTimeTasks() {
        return starvedRealTimeTasks;
    }

    public void setStarvedRealTimeTasks(int starvedRealTimeTasks) {
        this.starvedRealTimeTasks = starvedRealTimeTasks;
    }

    public int getMaxWaitingTime() {
        return maxWaitingTime;
    }

    public void addToSeekTime(int value) {
        seekTime += value;
    }

    public void addToBreakTime(int value) {
        breakTime += value;
    }

    public void addToStarvedRealTimeTasks(int value) {
        starvedRealTimeTasks += value;
    }

    public void updateMaxWaitingTime(int value) {
        if (value > maxWaitingTime)
            maxWaitingTime = value;
    }

    @Override
    public String toString() {
        return String.format("%-12s ", algorithmName) +
                ": seekTime=" + seekTime +
                ", breakTime=" + breakTime +
                ", starvedRealTimeTasks=" + starvedRealTimeTasks +
                ", maxWaitingTime=" + maxWaitingTime;
    }

}
