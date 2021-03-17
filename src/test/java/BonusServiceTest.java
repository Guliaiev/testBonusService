import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculateRegistedAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
        @org.junit.jupiter.api.Test
        void calculateNotRegisteredAndOverLimit () {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000000_60;
            boolean registered = false;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }
            @org.junit.jupiter.api.Test
            void calculateNotRegisteredAndUnderLimit () {
                BonusService service = new BonusService();

                // подготавливаем данные:
                long amount = 1000_60;
                boolean registered = false;
                long expected = 10;

                // вызываем целевой метод:
                long actual = service.calculate(amount, registered);

                // производим проверку (сравниваем ожидаемый и фактический):
                assertEquals(expected, actual);
        }
    }