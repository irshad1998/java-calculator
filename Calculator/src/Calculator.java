import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.*;

public class Calculator implements ActionListener{
	
	public static final Color DISPLAY_BG = new Color(0x9db6e0);
	
	String valueOne[] = new String[1];
	String valueTwo[] = new String[1];
	
	boolean vOne = true;
	boolean vTwo = false;
	
	
	boolean isDotClicked = false;
	
	boolean isDevide = false;
	boolean isMultiply = false;
	boolean isMin = false;
	boolean isPlus = false;
	boolean isResultPrinted = false;
	boolean isOpError = false;
	
	
	
	JFrame frame;
	JLabel display;
	
	JButton buttonSeven, buttonEight, buttonNine, buttonFour, buttonFive, buttonSix, buttonOne, buttonTwo, buttonThree, buttonZero;
	JButton buttonDot, buttonDevide, buttonMultiply, buttonMin, buttonPlus, buttonEquels, buttonClear;
	
	String oldValue;
	String newValue; 
	String printedResult;
	
	String oldVal;
	
    
	Calculator(){
		
		
		RoundedBorder displayBorder = new RoundedBorder(8);
	
		frame = new JFrame("Safa <3 Irshad");
		frame.setLayout(null);
		frame.setSize(290, 450);
		frame.setLocation(500, 180);

	
		
		display = new JLabel();
		display.setLayout(new CardLayout());
		display.setBounds(10, 10, 270, 50);
		display.setBackground(DISPLAY_BG);
		display.setBorder(displayBorder);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("", Font.PLAIN, 18));
		display.setOpaque(true);
		display.setText("");
		frame.add(display);
		
		buttonSeven = new JButton("7");
	
		buttonSeven.setBounds(10,70,60,60);
	    buttonSeven.setFont(new Font("", Font.BOLD, 14 ));
		buttonSeven.setFocusPainted(false);
		buttonSeven.setBackground(new Color(0x9db6e0));
		buttonSeven.setUI(new StyledButtonUI());
		buttonSeven.setOpaque(true);
		buttonSeven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("7");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"7";
						}else if(vTwo) {
							valueTwo[0] = text+"7";
						}
						
					} else {
						if(vOne) {
							valueOne[0] = text+"7";
						}else if(vTwo) {
							valueTwo[0] = text+"7";
						}
						display.setText(text + "7");
					}
				}
			
				
				
			}
		});
		frame.add(buttonSeven);
		
		
		buttonEight = new JButton("8");
		buttonEight.setBounds(80,70,60,60);
		buttonEight.setFocusPainted(false);
        buttonEight.setFont(new Font("", Font.BOLD, 14 ));
		buttonEight.setBackground(new Color(0x9db6e0));
		buttonEight.setUI(new StyledButtonUI());
		buttonEight.setOpaque(true);
		buttonEight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
				} else {
					if(isResultPrinted) {
						display.setText("8");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"8";
						}else if(vTwo) {
							valueTwo[0] = text+"8";
						}
						//display.setText("3");
					} else {
						if(vOne) {
							valueOne[0] = text+"8";
						}else if(vTwo) {
							valueTwo[0] = text+"8";
						}
						display.setText(text + "8");
					}
				}
	
				
			}
		});
		frame.add(buttonEight);
		
		buttonNine = new JButton("9");
		buttonNine.setBounds(150,70,60,60);
		buttonNine.setFocusPainted(false);
		buttonNine.setFont(new Font("", Font.BOLD, 14 ));
		buttonNine.setBackground(new Color(0x9db6e0));
		buttonNine.setUI(new StyledButtonUI());
		buttonNine.setOpaque(true);
		buttonNine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("9");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"9";
						}else if(vTwo) {
							valueTwo[0] = text+"9";
						}
						//display.setText("3");
					} else {
						if(vOne) {
							valueOne[0] = text+"9";
						}else if(vTwo) {
							valueTwo[0] = text+"9";
						}
						display.setText(text + "9");
					}
				}
				
			}
		});
		frame.add(buttonNine);
		
		
		
		buttonFour = new JButton("4");
		buttonFour.setBounds(10,140,60,60);
		buttonFour.setFont(new Font("", Font.BOLD, 14 ));
		buttonFour.setFocusPainted(false);
		buttonFour.setBackground(new Color(0x9db6e0));
		buttonFour.setUI(new StyledButtonUI());
		buttonFour.setOpaque(true);
		buttonFour.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("4");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"4";
						}else if(vTwo) {
							valueTwo[0] = text+"4";
						}
						//display.setText("3");
					} else {
						display.setText(text + "4");
						if(vOne) {
							valueOne[0] = text+"4";
						}else if(vTwo) {
							valueTwo[0] = text+"4";
						}
					}
				}
				
			}
		});
		frame.add(buttonFour);
		
		
		buttonFive = new JButton("5");
		buttonFive.setBounds(80,140,60,60);
		buttonFive.setFocusPainted(false);
		buttonFive.setFont(new Font("", Font.BOLD, 14 ));
		buttonFive.setBackground(new Color(0x9db6e0));
		buttonFive.setUI(new StyledButtonUI());
		buttonFive.setOpaque(true);
		buttonFive.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("5");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"5";
						}else if(vTwo) {
							valueTwo[0] = text+"5";
						}
						//display.setText("3");
					} else {
						if(vOne) {
							valueOne[0] = text+"5";
						}else if(vTwo) {
							valueTwo[0] = text+"5";
						}
						display.setText(text + "5");
					}
				}
				
			}
		});
		frame.add(buttonFive);
		
		buttonSix = new JButton("6");
		buttonSix.setBounds(150,140,60,60);
		buttonSix.setFocusPainted(false);
		buttonSix.setFont(new Font("", Font.BOLD, 14 ));
		buttonSix.setBackground(new Color(0x9db6e0));
		buttonSix.setUI(new StyledButtonUI());
		buttonSix.setOpaque(true);
        buttonSix.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("6");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"6";
						}else if(vTwo) {
							valueTwo[0] = text+"6";
						}
						//display.setText("3");
					} else {
						if(vOne) {
							valueOne[0] = text+"6";
						}else if(vTwo) {
							valueTwo[0] = text+"6";
						}
						display.setText(text + "6");
					}
				}
				
			}
		});
		frame.add(buttonSix);
		
		buttonOne = new JButton("1");
		buttonOne.setBounds(10,210,60,60);
		buttonOne.setFocusPainted(false);
		buttonOne.setFont(new Font("", Font.BOLD, 14 ));
		buttonOne.setBackground(new Color(0x9db6e0));
		buttonOne.setUI(new StyledButtonUI());
		buttonOne.setOpaque(true);
		buttonOne.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("1");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"1";
						}else if(vTwo) {
							valueTwo[0] = text+"1";
						}
						//display.setText("3");
					} else {
						if(vOne) {
							valueOne[0] = text+"1";
						}else if(vTwo) {
							valueTwo[0] = text+"1";
						}
						display.setText(text + "1");
					}
				}
				
			}
		});
		frame.add(buttonOne);
		
		buttonTwo = new JButton("2");
		buttonTwo.setBounds(80,210,60,60);
		buttonTwo.setFocusPainted(false);
		buttonTwo.setFont(new Font("", Font.BOLD, 14 ));
		buttonTwo.setBackground(new Color(0x9db6e0));
		buttonTwo.setUI(new StyledButtonUI());
		buttonTwo.setOpaque(true);
		buttonTwo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("2");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"2";
						}else if(vTwo) {
							valueTwo[0] = text+"2";
						}
					
					} else {
						if(vOne) {
							valueOne[0] = text+"2";
						}else if(vTwo) {
							valueTwo[0] = text+"2";
						}
						display.setText(text + "2");
					}
				}
				
			}
		});
		frame.add(buttonTwo);
		
		buttonThree = new JButton("3");
		buttonThree.setBounds(150,210,60,60);
		buttonThree.setFocusPainted(false);
		buttonThree.setFont(new Font("", Font.BOLD, 14 ));
		buttonThree.setBackground(new Color(0x9db6e0));
		buttonThree.setUI(new StyledButtonUI());
		buttonThree.setOpaque(true);
		buttonThree.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					//display.setText(text + "3");
					if(isResultPrinted) {
						display.setText("3");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"3";
						}else if(vTwo) {
							valueTwo[0] = text+"3";
						}
						//display.setText("3");
					} else {
						display.setText(text + "3");
					}
				} 
				
			}
		});
		frame.add(buttonThree);
		
		buttonZero = new JButton("0");
		buttonZero.setBounds(10,280,130,60);
		buttonZero.setFocusPainted(false);
		buttonZero.setFont(new Font("", Font.BOLD, 14 ));
		buttonZero.setBackground(new Color(0x9db6e0));
		buttonZero.setUI(new StyledButtonUI());
		buttonZero.setOpaque(true);
		buttonZero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					if(isResultPrinted) {
						display.setText("0");
						isResultPrinted = false;
						buttonEquels.setEnabled(true);
						if(vOne) {
							valueOne[0] = text+"0";
						}else if(vTwo) {
							valueTwo[0] = text+"0";
						}
						
					} else {
						if(vOne) {
							valueOne[0] = text+"0";
						}else if(vTwo) {
							valueTwo[0] = text+"0";
						}
						display.setText(text + "0");
					}
				}
				
			}
		});
		frame.add(buttonZero);
		
		
		buttonDot = new JButton(".");
		buttonDot.setBounds(150,280,60,60);
		buttonDot.setFocusPainted(false);
		buttonDot.setFont(new Font("", Font.BOLD, 14 ));
		buttonDot.setBackground(new Color(0x9db6e0));
		buttonDot.setUI(new StyledButtonUI());
		buttonDot.setOpaque(true);
		buttonDot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = display.getText().toString();
				if (text.length() > 10) {
					display.setText("Exeeds maximum numbers");
					
					
				} else {
					display.setText(text + ".");
					isDotClicked = true;
					if(isDotClicked) {
						buttonDot.setEnabled(false);
					}
				}
				
			}
		});
		frame.add(buttonDot);
		
		buttonDevide = new JButton("/");
		buttonDevide.setBounds(220,70,60,60);
		buttonDevide.setFocusPainted(false);
		buttonDevide.setFont(new Font("", Font.BOLD, 14 ));
		buttonDevide.setBackground(new Color(0x9db6e0));
		buttonDevide.setUI(new StyledButtonUI());
		buttonDevide.setOpaque(true);
		buttonDevide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				oldValue = display.getText().toString();
				display.setText("");
				buttonDot.setEnabled(true);
				isDevide = true;
				isMultiply = false;
				isMin = false;
				isPlus = false;
				vOne = false;
				vTwo = true;
				
			}
		});
		frame.add(buttonDevide);
		
		
		
		buttonMultiply = new JButton("*");
		buttonMultiply.setBounds(220,140,60,60);
		buttonMultiply.setFocusPainted(false);
		buttonMultiply.setFont(new Font("", Font.BOLD, 14 ));
		buttonMultiply.setBackground(new Color(0x9db6e0));
		buttonMultiply.setUI(new StyledButtonUI());
		buttonMultiply.setOpaque(true);
		buttonMultiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				oldValue = display.getText().toString();
				display.setText("");
				buttonDot.setEnabled(true);
				isDevide = false;
				isMultiply = true;
				isMin = false;
				isPlus = false;
				vOne = false;
				vTwo = true;
				
				
				
			}
		});
		frame.add(buttonMultiply);
		
		buttonPlus = new JButton("+");
		buttonPlus.setBounds(220,210,60,60);
		buttonPlus.setFocusPainted(false);
		buttonPlus.setFont(new Font("", Font.BOLD, 14 ));
		buttonPlus.setBackground(new Color(0x9db6e0));
		buttonPlus.setUI(new StyledButtonUI());
		buttonPlus.setOpaque(true);
		buttonPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				oldValue = display.getText().toString();
				display.setText("");
				buttonDot.setEnabled(true);
				isDevide = false;
				isMultiply = false;
				isMin = false;
				isPlus = true;
				vOne = false;
				vTwo = true;
				
				
				
				if(valueOne[0] != null && valueTwo[0] != null) {
					
					float v1 = Float.parseFloat(valueOne[0]);
					float v2 = Float.parseFloat(valueTwo[0]);
					
					float result = v1 + v2;


					display.setText(result+"");
					valueOne[0] = result + "";
					
					isResultPrinted = true;
					isDevide = false;
					isMultiply = false;
					isMin = false;
					isPlus = true;
					
					
				}
				
				
				
			}
		});
		frame.add(buttonPlus);
		
		buttonMin = new JButton("-");
		buttonMin.setBounds(220,280,60,60);
		buttonMin.setFocusPainted(false);
		buttonMin.setFont(new Font("", Font.BOLD, 14 ));
		buttonMin.setBackground(new Color(0x9db6e0));
		buttonMin.setUI(new StyledButtonUI());
		buttonMin.setOpaque(true);
		buttonMin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				oldValue = display.getText().toString();
				display.setText("");
				buttonDot.setEnabled(true);
				isDevide = false;
				isMultiply = false;
				isMin = true;
				isPlus = false;
				vOne = false;
				vTwo = true;
				
				
				
			}
		});
		frame.add(buttonMin);
		
		buttonClear = new JButton("C");
		buttonClear.setBounds(220,350,60,60);
		buttonClear.setFocusPainted(false);
		buttonClear.setFont(new Font("", Font.BOLD, 14 ));
		buttonClear.setBackground(new Color(0x9db6e0));
		buttonClear.setUI(new StyledButtonUI());
		buttonClear.setOpaque(true);
		buttonClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				oldValue = display.getText().toString();
				display.setText("");
				buttonDot.setEnabled(true);
				isDevide = false;
				isMultiply = false;
				isMin = false;
				isPlus = false;
				vOne = false;
				vTwo = true;
				
				
				
			}
		});
		frame.add(buttonClear);
		
		
		
        buttonEquels = new JButton("=");
        buttonEquels.setBounds(10,350,200,60);
        buttonEquels.setFocusPainted(false);
        buttonEquels.setFont(new Font("", Font.BOLD, 14 ));
        buttonEquels.setBackground(new Color(0x9db6e0));
        buttonEquels.setUI(new StyledButtonUI());
        buttonEquels.setOpaque(true);
        buttonEquels.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				buttonEquels.setEnabled(false);
				//newValue = display.getText().toString();
				vOne = true;
				vTwo = false;
				
				float v1 = Float.parseFloat(valueOne[0]);
				float v2 = Float.parseFloat(valueTwo[0]);
				
				float result;
				
				if(isMultiply) {
					result = v1*v2;
					display.setText(result + "");
					valueOne[0] = result+"";
					isResultPrinted = true;
				} else if(isDevide) {
					if(v1 == 0 && v2 == 0) {
						display.setText("Operation Error!");
						
					} else {
						result = v1/v2;
						display.setText(result+"");
						valueOne[0] = result+"";
						isResultPrinted = true;
					}
				} else if(isPlus) {
					result = v1+v2;
					display.setText(result + "");
					valueOne[0] = result+"";
					isResultPrinted = true;
				} else if(isMin) {
					result = v1-v2;
					display.setText(result + "");
					valueOne[0] = result+"";
					isResultPrinted = true;
				}

				
			}
		});
		frame.add(buttonEquels);
		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == buttonClear) {
			valueOne[0] = "";
			valueTwo[0] = "";
			vOne = true;
			vTwo = false;
			isDevide = false;
			isMultiply = false;
			isMin = false;
			isPlus = false;
			isResultPrinted = false;
			isOpError = false;
			display.setText("");
		}
		
	}

	
}
	
