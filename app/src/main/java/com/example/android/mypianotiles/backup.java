package com.example.android.mypianotiles;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class backup extends AppCompatActivity {

    float height, rowHeight = 152.0f;
    int numberOfRows = 0, numberOfRowsVisible = 0;
    int bottomPos = 0, topPos;
    float hitSpeed = 0, hitFrequency = 0;
    float almostInfinteLength;
    TextView textView;
    int ratio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.coutertext);
        final RelativeLayout main = (RelativeLayout) findViewById(R.id.gameparent);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                height = main.getMeasuredHeight() / getResources().getDisplayMetrics().density;
                almostInfinteLength = 10000 * height;
                ratio = Math.round(rowHeight / height);
                hitFrequency = 20 / 8;
                hitSpeed = hitFrequency * rowHeight * getResources().getDisplayMetrics().density;
                numberOfRows = (int) Math.floor(height / rowHeight);
                numberOfRowsVisible = (int) Math.ceil(height / rowHeight);
                numberOfRowsVisible+=10;
                createfirstRow();
            }
        }, 10);
    }

    public void createfirstRow() {
        LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final RelativeLayout main = (RelativeLayout) findViewById(R.id.gameparent);
        RelativeLayout.LayoutParams rp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        View view0 = inflater.inflate(R.layout.recyclerview, null);
        view0.setId(0);
        view0.setLayoutParams(rp1);
        main.addView(view0);
        findViewById(0).setY((height - rowHeight) * getResources().getDisplayMetrics().density);

        Button button0 = view0.findViewById(R.id.b0);
        Button button1 = view0.findViewById(R.id.b1);
        Button button2 = view0.findViewById(R.id.b2);
        Button button3 = view0.findViewById(R.id.b3);
        Random random = new Random();
        int r = random.nextInt(4);
        switch (r) {
            case 0: {
                button0.setText("Start");
                button0.setBackgroundColor(Color.WHITE);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                        animateInitialRows();
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                break;
            }
            case 1: {
                button1.setText("Start");
                button1.setBackgroundColor(Color.WHITE);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                        animateInitialRows();
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                break;
            }
            case 2: {
                button2.setText("Start");
                button2.setBackgroundColor(Color.WHITE);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                        animateInitialRows();
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                break;
            }
            case 3: {
                button3.setText("Start");
                button3.setBackgroundColor(Color.WHITE);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                        animateInitialRows();
                    }
                });
                break;
            }
        }
        creatStartingRows();
    }

    public void creatStartingRows() {
        LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final RelativeLayout main = (RelativeLayout) findViewById(R.id.gameparent);
        RelativeLayout.LayoutParams rp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        for (int i = 1; i <= numberOfRowsVisible; i++) {
            View view = inflater.inflate(R.layout.recyclerview, null);
            topPos=i;
            view.setId(i);
            view.setLayoutParams(rp1);
            Button button0 = view.findViewById(R.id.b0);
            Button button1 = view.findViewById(R.id.b1);
            Button button2 = view.findViewById(R.id.b2);
            Button button3 = view.findViewById(R.id.b3);
            Random random = new Random();
            int r = random.nextInt(4);
            switch (r) {
                case 0: {
                    button0.setBackgroundColor(Color.BLACK);
                    button0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                            v.setBackgroundColor(Color.parseColor("#999999"));
                        }
                    });
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    break;
                }
                case 1: {
                    button1.setBackgroundColor(Color.BLACK);
                    button0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                            v.setBackgroundColor(Color.parseColor("#999999"));
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    break;
                }
                case 2: {
                    button2.setBackgroundColor(Color.BLACK);
                    button0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                            v.setBackgroundColor(Color.parseColor("#999999"));
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    break;
                }
                case 3: {
                    button3.setBackgroundColor(Color.BLACK);
                    button0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            wrong=1;
                            v.setBackgroundColor(Color.RED);
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                            v.setBackgroundColor(Color.parseColor("#999999"));
                        }
                    });
                    break;
                }
            }
            button0.setText("" + topPos);
            main.addView(view);
            findViewById(i).setY((height - (i + 1) * rowHeight) * getResources().getDisplayMetrics().density);
            ytop=(height - (i + 1) * rowHeight) * getResources().getDisplayMetrics().density;
        }
    }
    float ytop;
    int counter=0;
    int tempcounter=0;
    long time,htime;

    public void animateInitialRows() {
        for (int i = 0; i <= numberOfRowsVisible; i++) {
            findViewById(i+bottomPos).animate().translationYBy(rowHeight*getResources().getDisplayMetrics().density);
            findViewById(i+bottomPos).animate().setDuration(1000);
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                regularCreation();
                tempcounter++;
                if(wrong==0)
                    animateInitialRows();
            }
        },1000);
    }
    int wrong=0;
    public void regularCreation() {
        topPos++;
        LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout main = (RelativeLayout) findViewById(R.id.gameparent);
        RelativeLayout.LayoutParams rp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        View view = inflater.inflate(R.layout.recyclerview, null);
        view.setId(topPos);
        view.setY(ytop);
        view.setLayoutParams(rp1);
        Button button0 = view.findViewById(R.id.b0);
        Button button1 = view.findViewById(R.id.b1);
        Button button2 = view.findViewById(R.id.b2);
        Button button3 = view.findViewById(R.id.b3);
        Random random = new Random();
        int r = random.nextInt(4);
        switch (r) {
            case 0: {
                button0.setBackgroundColor(Color.BLACK);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                break;
            }
            case 1: {
                button1.setBackgroundColor(Color.BLACK);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                break;
            }
            case 2: {
                button2.setBackgroundColor(Color.BLACK);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                break;
            }
            case 3: {
                button3.setBackgroundColor(Color.BLACK);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wrong=1;
                        v.setBackgroundColor(Color.RED);
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            counter++;
                            textView.setText(""+counter);
                        v.setBackgroundColor(Color.parseColor("#999999"));
                    }
                });
                break;
            }
        }
        button0.setText("" + topPos);
        main.addView(view);
        main.removeView(findViewById(bottomPos++));
    }
}
