package com.example.smartpark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class QuizActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "button" 클릭 시 팝업 다이얼로그 표시
                showDialog();
            }
        });
    }

    private void showDialog() {
        // 팝업 다이얼로그 생성
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.popup_profile);
        dialog.setCancelable(true); // 다이얼로그를 취소 가능하도록 설정

        // 다이얼로그 닫기 버튼 처리
        Button closeButton = dialog.findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // 다이얼로그 닫기
            }
        });

        // 팝업 다이얼로그 표시
        dialog.show();
    }
}