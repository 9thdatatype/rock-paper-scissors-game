public static winner(int p1, int p2){
    //1 = rock, 2 = paper, 3 = scissors
    if (p1 == 1 && p2 == 2){ // rock and paper
        return 2;
    }
    else if (p1 == 2 && p2 == 3){ // paper and scissors
        return 2;
    }
    else if (p1 == 3 && p2 == 1){ // scissors and rock
        return 2;
    }
    else if (p1 == 1 && p2 == 3){ // rock and scissors
        return 1;
    }
    else if (p1 == 2 &&  p2 == 1){ // paper and rock
        return 1;
    }
    else if (p1 == 3 && p2 == 2){ // scissors and paper
        return 1;
    }
    else if (p1 == 1 && p2 == 1){ // rock and rock 
        return 0;
    }
    else if (p1 == 2 && p2 == 2){ // paper and paper
        return 0;
    }
    else if (p1 == 3 && p2 == 3){ // scissors and scissors
        return 0;
    }
}