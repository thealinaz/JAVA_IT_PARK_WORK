package main.models.lists;

import main.models.base.Goal;

import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
public class Goals {
    private List<Goal> goals;

    public Goals(List<Goal> goals) {
        this.goals = goals;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }
}
