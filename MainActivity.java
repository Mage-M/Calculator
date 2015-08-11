package com.example.jisuanqi;
//  这里是计算逻辑的代码
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{

	private Button clear;
	private Button equal;
	private Button one;
	private Button two;
	private Button three;
	private Button four;
	private Button five;
	private Button six;
	private Button seven;
	private Button eight;
	private Button nine;
	private Button zero;
	private Button add;
	private Button reduce;
	private Button mul;
	private Button div;
	
	private TextView answer;
	
	private Integer count = 0;
	private StringBuilder temp1 = new StringBuilder();
	private StringBuilder temp2 = new StringBuilder();
	private String simple = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(this);
        equal = (Button)findViewById(R.id.equal);
        equal.setOnClickListener(this);
        add = (Button)findViewById(R.id.add);
        add.setOnClickListener(this);
        reduce = (Button)findViewById(R.id.reduce);
        reduce.setOnClickListener(this);
        mul = (Button)findViewById(R.id.mul);
        mul.setOnClickListener(this);
        div = (Button)findViewById(R.id.div);
        div.setOnClickListener(this);
        one = (Button)findViewById(R.id.one);
        one.setOnClickListener(this);
        two = (Button)findViewById(R.id.two);
        two.setOnClickListener(this);
        three = (Button)findViewById(R.id.three);
        three.setOnClickListener(this);
        four = (Button)findViewById(R.id.four);
        four.setOnClickListener(this);
        five = (Button)findViewById(R.id.five);
        five.setOnClickListener(this);
        six = (Button)findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = (Button)findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = (Button)findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = (Button)findViewById(R.id.nine);
        nine.setOnClickListener(this);
        zero = (Button)findViewById(R.id.zero);
        zero.setOnClickListener(this);
        
        answer = (TextView)findViewById(R.id.answer);
        //answer.setText("0");
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.clear:
			answer.setText(" ");
			temp1.delete(0, temp1.length());
			temp2.delete(0, temp2.length());
			simple = null;
			count = 0;
			break;
		case R.id.one:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("1");
				if(simple == null) {
					temp1.append("1");
				} else {
					temp2.append("1");
				}
			} else {
				answer.setText("1");
				if(simple == null) {
					temp1.append("1");
				} else {
					temp2.append("1");
				}
			}
			break;
		case R.id.two:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("2");
				if(simple == null) {
					temp1.append("2");
				} else {
					temp2.append("2");
				}
			} else {
				answer.setText("2");
				if(simple == null) {
					temp1.append("2");
				} else {
					temp2.append("2");
				}
			}
			break;
		case R.id.three:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("3");
				if(simple == null) {
					temp1.append("3");
				} else {
					temp2.append("3");
				}
			} else {
				answer.setText("3");
				if(simple == null) {
					temp1.append("3");
				} else {
					temp2.append("3");
				}
			}
			break;
		case R.id.four:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("4");
				if(simple == null) {
					temp1.append("4");
				} else {
					temp2.append("4");
				}
			} else {
				answer.setText("4");
				if(simple == null) {
					temp1.append("4");
				} else {
					temp2.append("4");
				}
			}
			break;
		case R.id.five:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("5");
				if(simple == null) {
					temp1.append("5");
				} else {
					temp2.append("5");
				}
			} else {
				answer.setText("5");
				if(simple == null) {
					temp1.append("5");
				} else {
					temp2.append("5");
				}
			}
			break;
		case R.id.six:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("6");
				if(simple == null) {
					temp1.append("6");
				} else {
					temp2.append("6");
				}
			} else {
				answer.setText("6");
				if(simple == null) {
					temp1.append("6");
				} else {
					temp2.append("6");
				}
			}
			break;
		case R.id.seven:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("7");
				if(simple == null) {
					temp1.append("7");
				} else {
					temp2.append("7");
				}
			} else {
				answer.setText("7");
				if(simple == null) {
					temp1.append("7");
				} else {
					temp2.append("7");
				}
			}
			break;
		case R.id.eight:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("8");
				if(simple == null) {
					temp1.append("8");
				} else {
					temp2.append("8");
				}
			} else {
				answer.setText("8");
				if(simple == null) {
					temp1.append("8");
				} else {
					temp2.append("8");
				}
			}
			break;
		case R.id.nine:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("9");
				if(simple == null) {
					temp1.append("9");
				} else {
					temp2.append("9");
				}
			} else {
				answer.setText("9");
				if(simple == null) {
					temp1.append("9");
				} else {
					temp2.append("9");
				}
			}
			break;
		case R.id.zero:
			if(temp1.length() < 1) answer.setText(null);
			if(answer.getText() != null) {
				answer.append("0");
				if(simple == null) {
					temp1.append("0");
				} else {
					temp2.append("0");
				}
			} else {
				answer.setText("0");
				if(simple == null) {
					temp1.append("0");
				} else {
					temp2.append("0");
				}
			}
			break;
		case R.id.add:
			//answer.append("+");
			simple = "+";
			answer.setText(" ");
			break;
		case R.id.reduce:
			//answer.append("+");
			simple = "-";
		
			answer.setText(" ");
			break;
		case R.id.mul:
			//answer.append("+");
			simple = "*";
			answer.setText(" ");
			break;
		case R.id.div:
			//answer.append("+");
			simple = "/";
			answer.setText(" ");
			break;
		
		case R.id.equal:
			if(simple == "+") {
				count = Integer.parseInt(temp1.toString()) + Integer.parseInt(temp2.toString());
				temp1.delete(0, temp1.length());
				temp2.delete(0, temp2.length());
				answer.setText(count.toString());
				simple = null;
				count = 0;
			} else if(simple == "-") {
				count = Integer.parseInt(temp1.toString()) - Integer.parseInt(temp2.toString());
				temp1.delete(0, temp1.length());
				temp2.delete(0, temp2.length());
				answer.setText(count.toString());
				simple = null;
				count = 0;
			} else if(simple == "*") {
				count = Integer.parseInt(temp1.toString()) * Integer.parseInt(temp2.toString());
				temp1.delete(0, temp1.length());
				temp2.delete(0, temp2.length());
				answer.setText(count.toString());
				simple = null;
				count = 0;
			} else if(simple == "/") {
				count = Integer.parseInt(temp1.toString()) / Integer.parseInt(temp2.toString());
				temp1.delete(0, temp1.length());
				temp2.delete(0, temp2.length());
				answer.setText(count.toString());
				simple = null;
				count = 0;
			}
			break;
		}
	}


  
}
