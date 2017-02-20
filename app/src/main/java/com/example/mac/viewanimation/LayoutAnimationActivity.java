package com.example.mac.viewanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LayoutAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_animation);


        String[] values = new String[]{"数据1","数据2","数据3","数据4","数据5"
                ,"数据6","数据7","数据8","数据9","数据10"};
        /**
         * 第二个参数：布局ID
         * 第三个参数：text的ID
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values);

        ListView listview = (ListView) findViewById(R.id.listview);

        listview.setAdapter(adapter);

        /**
         * 通过代码的方式加载
         */
//        //通过加载XML动画设置文件来创建一个Animation对象；
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.item_anim);
//        //得到一个LayoutAnimationController对象；
//        LayoutAnimationController controller = new LayoutAnimationController(animation);
//        //设置控件显示的顺序；
//        controller.setOrder(LayoutAnimationController.ORDER_REVERSE);
//        //设置控件显示间隔时间；
//        controller.setDelay(1);
//        //为ListView设置LayoutAnimationController属性；
//        listview.setLayoutAnimation(controller);

    }

}
