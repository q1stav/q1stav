import java.util.Scanner;
import java.util.Random;

public class TickTackToe {
    public static char[][] map; //матрица игры
    private static int SIZE=3; // размерность поля

    private static final char DOT_EMPTY='-';  //пустой символ
    private static final char DOT_X='X';      //крестик
    private static final char DOT_O='O';      //нолик
    private static Scanner scanner=new Scanner(System.in);


    public static void  main(String[] args){
        initMap();
        printMap();

        while (true){
            humanTurn();
            if(isEndGame(DOT_X)){
                break;
            }
            computerTurn();
            if(isEndGame(DOT_O)){
                break;
            }
        }
    }

    private static boolean isEndGame(char playerSymbol){
        boolean result=false;

        printMap();

        //проверка следующего хода
        if(checkWin(playerSymbol)){
            System.out.println("Победили " + playerSymbol);
            result=true;
        }

        if(isMapFull()){
            System.out.println("Ничья");
            result=true;
        }
        return result;
    }

    private static void humanTurn() {
        int x,y;
        do{
            System.out.println("Введите координаты ячейки x,y");
            y=scanner.nextInt()-1;
            x=scanner.nextInt()-1;
        }
        while (!isCellValid(x,y));
        map[y][x]=DOT_X;
    }

    private static void computerTurn() {
        int x,y;
        do{
            System.out.println("Типа компутер.....Введите координаты ячейки x,y");
            y=scanner.nextInt()-1;
            x=scanner.nextInt()-1;
        }
        while (!isCellValid(x,y));
        map[y][x]=DOT_O;
    }

    public static boolean isCellValid(int x, int y){
        boolean result=true;
        if (x<0 || x>SIZE || y<0 || y>SIZE){
            System.out.println("Не то число");
            result=false; // бл* нужен break, а он не робiт
        }
        if (map[y][x]!=DOT_EMPTY){
            System.out.println("Занято");
            result=false;
        }
        return result;
    }

    private static boolean checkWin(char playerSymbol){
        boolean result=false;

        if
        (((map[0][0] == playerSymbol) && (map[0][1] == playerSymbol) && (map[0][2] == playerSymbol)) ||
                ((map[1][0] == playerSymbol) && (map[1][1] == playerSymbol) && (map[1][2] == playerSymbol)) ||
                ((map[2][0] == playerSymbol) && (map[2][1] == playerSymbol) && (map[2][2] == playerSymbol)) ||
                ((map[0][0] == playerSymbol) && (map[1][0] == playerSymbol) && (map[2][0] == playerSymbol)) ||
                ((map[0][1] == playerSymbol) && (map[1][1] == playerSymbol) && (map[2][1] == playerSymbol)) ||
                ((map[0][2] == playerSymbol) && (map[1][2] == playerSymbol) && (map[2][2] == playerSymbol)) ||
                ((map[0][2] == playerSymbol) && (map[1][1] == playerSymbol) && (map[2][0] == playerSymbol)) ||
                ((map[0][0] == playerSymbol) && (map[1][1] == playerSymbol) && (map[2][2] == playerSymbol))){
            System.out.println("ХАРОШ");
            result=true;
        }
        return result;
    }

    private static boolean isMapFull(){
        boolean result=true;

        for(int i=0; i<SIZE;i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    result = false;
                }
            }
        }
        return result;
    }


    private static void initMap(){
        map=new char[SIZE][SIZE];
        for(int i=0; i<SIZE;i++){
            for(int j=0; j<SIZE;j++){
                map[i][j]=DOT_EMPTY;
            }
        }
    }

    private static void printMap(){
        for(int i=0; i<=SIZE;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<SIZE;i++){
            System.out.print((i+1)+" ");
            for (int j=0;j<SIZE;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}