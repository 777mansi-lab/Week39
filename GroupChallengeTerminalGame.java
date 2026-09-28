public class GroupChallengeTerminalGame {
public static void main(String[] args) {

    Random random = new Random(); //få tal med noget længere nede
    Scanner scanner = new Scanner(System.in); //
    int totalPlayerScore = 0;
    int totalPCScore = 0;
    int currentScorePlayer = 0;
    int currentScorePC= 0;
    boolean gameRunning = true;
    String playerChoice;
    String playMore;
    boolean playerNotAnswered = true;

    System.out.println("=== Er du klar til at spille sten, saks eller papir ===");
    System.out.println("Jeg har valgt en af dem");
    System.out.println("Bedst ud af 3");

    while (gameRunning) {
        int PCChoice = random.nextInt(3) + 1;

        System.out.println("Okay så: Sten, saks eller papir");
        System.out.print("Dit valg: ");

        playerChoice = scanner.nextLine().toLowerCase();

        switch (playerChoice) {
            case "sten": //sten
                if (PCChoice == 1) {
                    System.out.println("Jeg har valgt sten. Uafgjort");
                } else if (PCChoice == 2) {
                    System.out.println("Jeg har valgt saks. Du vinder, point til dig");
                    currentScorePlayer++;
                } else if (PCChoice == 3) {
                    System.out.println("Jeg har valgt papir. Du taber, point til mig");
                    currentScorePC++;
                } else {
                    System.out.print("Det ligner du skrev noget forkert, prøv igen");
                }
                break;
            case "saks": //saks
                if (PCChoice == 1) {
                    System.out.println("Jeg har valgt sten. Du taber, point til mig");
                    currentScorePC++;
                } else if (PCChoice == 2) {
                    System.out.println("Jeg har valgt saks. Uafgjort");
                } else if (PCChoice == 3) {
                    System.out.println("Jeg har valgt papir. Du vinder, point til dig");
                    currentScorePlayer++;
                } else {
                    System.out.print("Det ligner du skrev noget forkert, prøv igen");
                }
                break;
            case "papir": //papir
                if (PCChoice == 1) {
                    System.out.println("Jeg har valgt sten. Du vinder, point til dig");
                    currentScorePlayer++;
                } else if (PCChoice == 2) {
                    System.out.println("Jeg har valgt saks. Du taber, point til mig");
                    currentScorePC++;
                } else if (PCChoice == 3) {
                    System.out.println("Jeg har valgt papir. Uafgjort");
                } else {
                    System.out.print("Det ligner du skrev noget forkert, prøv igen");
                }
                break;


        }
        System.out.println("Der står lige nu " + currentScorePlayer + ":" + currentScorePC + " til dig");
        if(currentScorePC == 3)
        {
            playerNotAnswered = true;
            totalPCScore++;
            System.out.println("Jeg vandt. 🤣🤣 Der står nu " + totalPlayerScore + ":" + totalPCScore + " til dig");
            System.out.println("Vil du spille videre? Ja eller nej");
            while (playerNotAnswered) {
                playMore = scanner.nextLine().toLowerCase();
                if (playMore.equals("ja")) {
                    System.out.println("Let's go");
                    currentScorePC = 0;
                    currentScorePlayer = 0;
                    playerNotAnswered=false;
                } else if (playMore.equals("nej")) {
                    System.out.println("Tak for spil");
                    System.out.println("Scoren endte med" + totalPlayerScore + ":" + totalPCScore + " til dig");
                    gameRunning = false;
                    playerNotAnswered=false;
                } else {
                    System.out.println("Du skrev vist IKKE det rigtige. Prøv igen");
                }
            }
        }

        else if (currentScorePlayer ==3)
        {
            playerNotAnswered=true;
            totalPlayerScore++;
            System.out.println("Du vandt... 😓😥 Der står nu " + totalPlayerScore + ":" + totalPCScore + " til dig");
            System.out.println("Vil du spille videre? Ja eller nej");
            while (playerNotAnswered) {
                playMore = scanner.nextLine().toLowerCase();
                if (playMore.equals("ja")) {
                    System.out.println("Let's go");
                    currentScorePC = 0;
                    currentScorePlayer = 0;
                    playerNotAnswered=false;
                } else if (playMore.equals("nej")) {
                    System.out.println("Tak for spil");
                    System.out.println("Scoren endte med" + totalPlayerScore + ":" + totalPCScore + " til dig");
                    gameRunning = false;
                    playerNotAnswered=false;
                } else {
                    System.out.println("Du skrev vist IKKE det rigtige. Prøv igen");
                }
            }
        }
    }
    scanner.close();
}
}