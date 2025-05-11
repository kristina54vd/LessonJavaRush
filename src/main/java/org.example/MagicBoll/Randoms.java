package org.example.MagicBoll;

import java.util.Random;

public class Randoms {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        int number = random.nextInt(7)+1;

        String [] arrays = new String[8];
        arrays[0] = CERTAIN;
        arrays[1] = DEFINITELY;
        arrays[2] = MOST_LIKELY;
        arrays[3] = OUTLOOK_GOOD;
        arrays[4] = ASK_AGAIN_LATER;
        arrays[5] = TRY_AGAIN;
        arrays[6] = NO;
        arrays[7] = VERY_DOUBTFUL;


        return arrays[number];
    }

    }


