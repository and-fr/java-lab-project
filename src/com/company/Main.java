package com.company;

import com.company.assets.Tool;


public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        game.showSummary();
        while(true){
            game.showMainMenu();

            switch (Tool.getKey()){
                case '0':
                    return;
                case '1': // check available projects
                    game.optionAvailableProjects();
                    break;
                case '2': // search for clients
                    game.optionSearchForClients();
                    break;
                case '3': // programming
                    game.optionProgramming();
                    break;
                case '4': // testing
                    game.optionTesting();
                    break;
                case '5': // return project
                    game.optionReturnProject();
                    break;
                case '6': // employees
                    break;
                case '7': // contractors
                    game.optionContractors();
                    break;
                case '8': // company tasks
                    break;
                case '9': // next day
                    game.advanceNextDay();
                    break;
            }
        }

    }
}
