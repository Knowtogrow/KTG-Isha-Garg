package com.sujeet.chatappdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.midi.MidiOutputPort;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<MessageChatModel> messageChatModelList =  new ArrayList<>();
    RecyclerView recyclerView;
    MessageChatAdapter adapter ;

    EditText messageET;
    ImageView sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

        messageET = (EditText)findViewById(R.id.messageET);
        sendBtn = (ImageView) findViewById(R.id.sendBtn);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);





//        MessageChatModel model4 = new MessageChatModel(
//                "Thankyou for your query. We will get back to you!",
//                "10:00 PM",
//                1
//        );


   //     messageChatModelList.add(model1);
//        messageChatModelList.add(model2);
//        messageChatModelList.add(model3);
//       messageChatModelList.add(model4);
//        messageChatModelList.add(model1);
//        messageChatModelList.add(model2);
//        messageChatModelList.add(model3);
 //      messageChatModelList.add(model4);
//        messageChatModelList.add(model1);
//        messageChatModelList.add(model2);
//        messageChatModelList.add(model3);
//        messageChatModelList.add(model4);

        recyclerView.smoothScrollToPosition(messageChatModelList.size());
        adapter = new MessageChatAdapter(messageChatModelList, MainActivity.this );
        recyclerView.setAdapter(adapter);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = messageET.getText().toString();

                MessageChatModel model = new MessageChatModel(
                        msg,
                        "02:30 PM",
                        0
                );
                messageChatModelList.add(model);
                recyclerView.smoothScrollToPosition(messageChatModelList.size());
                adapter.notifyDataSetChanged();
                messageET.setText("");


            }
        });

    }


    public void btn_science(View view) {

    }

    public void btn_stats(View view) {
    }

    public void btn_lang(View view) {
    }

    public void btn_human(View view) {
    }
}
