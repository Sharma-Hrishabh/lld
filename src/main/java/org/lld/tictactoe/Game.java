package org.lld.tictactoe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    public Game(){
        Board b = new Board(3);
        Player p1 = new Player("John",new PieceX());
        Player p2 = new Player("Jane",new PieceO());

        Queue<Player> players = new LinkedList<>();
        players.add(p1);
        players.add(p2);

        Boolean won=false;

        while(!won){
            Player currentPlayer = players.peek();
            players.remove();
            System.out.println(currentPlayer.getName() + " chance:");
            Scanner scanner = new Scanner(System.in);
            int row,col;

            row = scanner.nextInt();
            col = scanner.nextInt();

            b.move(row,col,currentPlayer);
            won = b.checkWin(row,col,currentPlayer);
            if(won) System.out.println("Winner: "+currentPlayer.getName());
            players.add(currentPlayer);
        }

    }
}
