package com.company;

public class Main {


    public void main(String[] args) {
        Game game = new Game();
        game.numPlayers++;
        game.addPlayer();
        game.gameOver();
        game.endGame();
    }

    public class Game

        {
            private int numPlayers;

            private boolean gameOver;


            public void Game ()

            {

                numPlayers = 1;

                gameOver = false;

            }


            public void addPlayer ()

            {

                numPlayers++;

            }


            public void endGame ()

            {

                gameOver = true;

            }

        }
    }

