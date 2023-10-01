package kr.ac.jbnu.se.tetris.views;

import kr.ac.jbnu.se.tetris.models.KeyInput;
import kr.ac.jbnu.se.tetris.models.Member;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TetrisFrameForTwo extends TetrisFrame {

    private PlayerPage playerPage1;
    private PlayerPage playerPage2;
    private int sizeX=400;
    private int sizeY=400;

    private Member player1;
    private Member player2;

    public TetrisFrameForTwo() {

    }
    public void init(){
        KeyInput p1Key = new KeyInput('w','s','d','a',(char)(KeyEvent.VK_SPACE),'p','h');
        KeyInput p2Key = new KeyInput('i','k','l','j','o','p','i');
        Member p1= new Member();
        Member p2=new Member();
        setLayout(new GridLayout(1,2));
        //플레이어1은 왼쪽으로, 플레이어2는 오른쪽에 배치
        playerPage1=new PlayerPage(p1,p1Key);
        playerPage2=new PlayerPage(p2,p2Key);

        add(playerPage1, BorderLayout.WEST);
        add(playerPage2, BorderLayout.EAST);
        //각 창의 타이틀에 각 플레이어의 이름을 배치
        playerPage1.init();
        playerPage2.init();

        setSize(sizeX, sizeY);
        setPreferredSize(new Dimension(sizeX, sizeY));
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);


    }
    public void initForMulti(){

        KeyInput p1Key = new KeyInput('w','s','d','a',(char)(KeyEvent.VK_SPACE),'p','h');
        KeyInput p2Key = new KeyInput('i','k','l','j','o','p','i');
        Member p1= new Member();
        Member p2=new Member();
        setLayout(new GridLayout(1,2));
        //플레이어1은 왼쪽으로, 플레이어2는 오른쪽에 배치
        playerPage1=new PlayerPage(p1,p1Key);
        playerPage2=new PlayerPage(p2,p2Key);

        add(playerPage1, BorderLayout.WEST);
        add(playerPage2, BorderLayout.EAST);
        //각 창의 타이틀에 각 플레이어의 이름을 배치
        playerPage1.init();
        playerPage2.init();

        setSize(sizeX, sizeY);
        setPreferredSize(new Dimension(sizeX, sizeY));
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);

    }
}