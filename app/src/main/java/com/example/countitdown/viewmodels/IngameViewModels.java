package com.example.countitdown.viewmodels;



import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.countitdown.models.Score;
import androidx.lifecycle.ViewModel;

public class IngameViewModels extends ViewModel {

    public MutableLiveData<Score> scoreMutableLiveData = new MutableLiveData<>();
    public Score score = new Score();

    public LiveData<Score> getScore(){
        return scoreMutableLiveData;
    }

    public void addPlayer1Score(int point){
        score.setPlayer1Score(score.getPlayer1Score()+point);
        scoreMutableLiveData.setValue(score);
    }

    public void addPlayer2Score(int point){
        score.setPlayer2Score(score.getPlayer2Score()+point);
        scoreMutableLiveData.setValue(score);
    }
}
