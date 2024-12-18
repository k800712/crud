package crud;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class MyController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/lotto-number")
    public int getLottoNumber() {

        return new Random().nextInt(45) + 1;
    }

    @GetMapping("/lotto-numbers")

    public List<Integer> getLottoNumbers() {

        List<Integer> numbers = IntStream.rangeClosed(1, 45).boxed()
                .collect(Collectors.toList());

        Collections.shuffle(numbers);

        return numbers.subList(0, 6);
    }

    @GetMapping("/square")
    public int getSquare(@RequestParam("numberToSquare") int number) {

        return number * number;
    }

    @GetMapping("/fahrenheit")
    public double getCelsiusToFahrenheit(@RequestParam("celsiusDegree") double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @GetMapping("/square/{numberToSquare}")
    public int getSquareByPath(@PathVariable("numberToSquare") int number) {

        return number * number;
    }

    @GetMapping("/fahrenheit/{celsiusDegree}")
    public double getCelsiusToFahrenheitByPath(@PathVariable("celsiusDegree") double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    @PostMapping("/square")
    public int postSquare(@RequestBody numberToSquare request) {
        return request.numberToSquare() * request.numberToSquare();
    }

    @PostMapping("/fahrenheit")
    public double postCelsiusToFahrenheit(@RequestBody celsiusDegree request) {
        return (request.celsiusDegree() * 9 / 5) + 32;
    }
}
